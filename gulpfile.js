'use strict';
// Require
var gulp = require('gulp');
var templateCache = require('gulp-angular-templatecache');
////重命名
var rename = require('gulp-rename');
var uglify = require('gulp-uglify');
var minifyCss = require('gulp-clean-css');
var concat = require('gulp-concat');
var eslint = require('gulp-eslint');
var del = require('del');
var path = require('path');
var imagemin = require('gulp-imagemin');//图片压缩
var  pngcrush = require('imagemin-pngcrush');



// Vars
var src = 'app/';
var dst = 'src/main/resources/static/dist/';
var tplPath = src+'tpl'; //must be same as fileManagerConfig.tplPath
var jsFile = 'console.all.js';
var jsMinFile = 'console.all.min.js';
var cssFile = 'console.all.css';
var cssMinFile = 'console.all.min.css';


gulp.task('clean', function (cb) {
    del(dst + '/*', cb);
});

/**
 * 推荐
 * 将html模板页面 以angularjs的方式 压缩并缓存
 * */
gulp.task('cache-templates', function () {
    return gulp.src([tplPath+'/*/*.html'
        ,tplPath +'/*.html'])
        //templateHTML.js为压缩之后的文件名，注意.js后缀名不能少
        .pipe(templateCache(jsFile,{
            //路径的前缀
            //root: 'templates/wap/',
            //模块的名字
            module:"app",
            base: function(file) {
                return tplPath + '/' + path.basename(file.history.toString());
            }
        }))
        .pipe(gulp.dest(dst));
});


// 压缩图片
gulp.task('img', function () {
    var imgOption = {
        optimizationLevel: 5, //类型：Number  默认：3  取值范围：0-7（优化等级）
        progressive: true, //类型：Boolean 默认：false 无损压缩jpg图片
        interlaced: true, //类型：Boolean 默认：false 隔行扫描gif进行渲染
        multipass: true, //类型：Boolean 默认：false 多次优化svg直到完全优化
        svgoPlugins: [{removeViewBox: false}],//不要移除svg的viewbox属性
        use: [pngcrush()] //使用pngquant深度压缩png图片的imagemin插件
    };
    return gulp.src('app/img/**/*')
        .pipe(imagemin(imgOption))
        .pipe(gulp.dest('./dist/img/'))
        .pipe(notify({message: 'img task ok'}));
});


gulp.task('concat-uglify-js', ['cache-templates'], function() {
    return gulp.src([
        src + 'js/app.js',
        src + 'js/*.js',
        src + 'app/*/*.js',
        src + 'js/*/*.js',
        dst + '/' + jsFile
    ])
        .pipe(concat(jsFile))
        .pipe(gulp.dest(dst))
        .pipe(rename(jsMinFile))
        .pipe(uglify())
        .pipe(gulp.dest(dst));
});
////合并、压缩js文件
//gulp.task('scripts', function() {
//    gulp.src('./app/**/*.js')
//        .pipe(concat('all.js'))
//        .pipe(gulp.dest('./dist/js'))
//        .pipe(rename('all.min.js'))
//        .pipe(uglify())
//        .pipe(gulp.dest('./dist/js'));
//});
gulp.task('minify-css', function() {
    return gulp.src(src + 'css/*.css')
        .pipe(concat(cssFile))
        .pipe(gulp.dest(dst))
        .pipe(minifyCss({compatibility: 'ie8'}))
        .pipe(concat(cssMinFile))
        .pipe(gulp.dest(dst));
});

//gulp.task('minify-css', function() {
//    return gulp.src(src + 'css/*.css')
//        .pipe(concat(cssFile))
//        .pipe(gulp.dest(dst))
//        .pipe(rename(cssMinFile))
//        //.pipe(minifyCss({compatibility: 'ie8'}))
//        //.pipe(concat(cssMinFile))
//        .pipe(uglify())
//        .pipe(gulp.dest(dst));
//});

gulp.task('default', ['concat-uglify-js', 'minify-css','img']);
