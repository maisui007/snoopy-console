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


// Vars
var src = 'app/';
var dst = 'src/main/resources/static/dist/';
var tplPath = src+'templates'; //must be same as fileManagerConfig.tplPath
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
    return gulp.src(tplPath+'/*.html')
        //templateHTML.js为压缩之后的文件名，注意.js后缀名不能少
        .pipe(templateCache(jsFile,{
            //路径的前缀
            //root: 'templates/wap/',
            //模块的名字
            module:"snoopyConsole",
            base: function(file) {
                return tplPath + '/' + path.basename(file.history.toString());
            }
        }))
        .pipe(gulp.dest(dst));
});


gulp.task('concat-uglify-js', ['cache-templates'], function() {
    return gulp.src([
        src + 'js/route/app.route.js',
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

gulp.task('default', ['concat-uglify-js', 'minify-css']);
