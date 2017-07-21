module.exports = {
    dev: {
        nonull: true,
        files: [
            // Include our bower JS dependencies

            // angular
            {src: "bower_components/angular/angular.js", dest: "snoopy/vendor/angular/angular.js"},
            {src: "bower_components/angular-animate/angular-animate.js", dest: "snoopy/vendor/angular/angular-animate/angular-animate.js"},
            {src: "bower_components/angular-cookies/angular-cookies.js", dest: "snoopy/vendor/angular/angular-cookies/angular-cookies.js"},
            {src: "bower_components/angular-resource/angular-resource.js", dest: "snoopy/vendor/angular/angular-resource/angular-resource.js"},
            {src: "bower_components/angular-sanitize/angular-sanitize.js", dest: "snoopy/vendor/angular/angular-sanitize/angular-sanitize.js"},
            {src: "bower_components/angular-touch/angular-touch.js", dest: "snoopy/vendor/angular/angular-touch/angular-touch.js"},
          
            // bootstrap
            {src: "bower_components/bootstrap/dist/css/bootstrap.css", dest: "snoopy/css/bootstrap.css"},
            {src: "bower_components/bootstrap/dist/js/bootstrap.js", dest: "snoopy/vendor/jquery/bootstrap.js"},
            {src: "**", dest: "snoopy/fonts", cwd: 'bower_components/bootstrap/fonts', expand : true},

            // fontawesome
            {src: "bower_components/font-awesome/css/font-awesome.min.css", dest: "snoopy/css/font-awesome.min.css"},
            {src: "**", dest: "snoopy/fonts", cwd: 'bower_components/font-awesome/fonts', expand : true},

            // libs
            {src: "bower_components/moment/min/moment.min.js", dest: "snoopy/vendor/libs/moment.min.js"},
            {src: "bower_components/screenfull/dist/screenfull.min.js", dest: "snoopy/vendor/libs/screenfull.min.js"},

            // core
            {src: "bower_components/angular-ui-router/release/angular-ui-router.js", dest: "snoopy/vendor/angular/angular-ui-router/angular-ui-router.js"},
            {src: "bower_components/angular-bootstrap/ui-bootstrap-tpls.js", dest: "snoopy/vendor/angular/angular-bootstrap/ui-bootstrap-tpls.js"},
            {src: "bower_components/angular-translate/angular-translate.js", dest: "snoopy/vendor/angular/angular-translate/angular-translate.js"},
            {src: "bower_components/angular-ui-utils/ui-utils.js", dest: "snoopy/vendor/angular/angular-ui-utils/ui-utils.js"},
            {src: "bower_components/ngstorage/ngStorage.js", dest: "snoopy/vendor/angular/ngstorage/ngStorage.js"},
            {src: "bower_components/oclazyload/dist/ocLazyLoad.js", dest: "snoopy/vendor/angular/oclazyload/ocLazyLoad.js"},

            // modules for lazy load
            {src: "bower_components/angular-ui-select/dist/select.min.js", dest: "snoopy/vendor/modules/angular-ui-select/select.min.js"},
            {src: "bower_components/angular-ui-select/dist/select.min.css", dest: "snoopy/vendor/modules/angular-ui-select/select.min.css"},

            {src: "bower_components/textAngular/dist/textAngular.min.js", dest: "snoopy/vendor/modules/textAngular/textAngular.min.js"},
            {src: "bower_components/textAngular/dist/textAngular-sanitize.min.js", dest: "snoopy/vendor/modules/textAngular/textAngular-sanitize.min.js"},

            {src: "bower_components/venturocket-angular-slider/build/angular-slider.min.js", dest: "snoopy/vendor/modules/angular-slider/angular-slider.min.js"},
            
            {src: "bower_components/angular-bootstrap-nav-tree/dist/abn_tree_directive.js", dest: "snoopy/vendor/modules/angular-bootstrap-nav-tree/abn_tree_directive.js"},
            {src: "bower_components/angular-bootstrap-nav-tree/dist/abn_tree.css", dest: "snoopy/vendor/modules/angular-bootstrap-nav-tree/abn_tree.css"},

            {src: "bower_components/angular-file-upload/angular-file-upload.min.js", dest: "snoopy/vendor/modules/angular-file-upload/angular-file-upload.min.js"},

            {src: "bower_components/ngImgCrop/compile/minified/ng-img-crop.js", dest: "snoopy/vendor/modules/ngImgCrop/ng-img-crop.js"},
            {src: "bower_components/ngImgCrop/compile/minified/ng-img-crop.css", dest: "snoopy/vendor/modules/ngImgCrop/ng-img-crop.css"},
            
            // {src: "bower_components/angular-ui-calendar/src/calendar.js", dest: "src/vendor/modules/angular-ui-calendar/calendar.js"},
            
            {src: "bower_components/angular-ui-map/ui-map.js", dest: "snoopy/vendor/modules/angular-ui-map/ui-map.js"},

            {src: "bower_components/angularjs-toaster/toaster.js", dest: "snoopy/vendor/modules/angularjs-toaster/toaster.js"},
            {src: "bower_components/angularjs-toaster/toaster.css", dest: "snoopy/vendor/modules/angularjs-toaster/toaster.css"},

            {src: "bower_components/ng-grid/build/ng-grid.min.js", dest: "snoopy/vendor/modules/ng-grid/ng-grid.min.js"},
            {src: "bower_components/ng-grid/ng-grid.min.css", dest: "snoopy/vendor/modules/ng-grid/ng-grid.min.css"},

            {src: "bower_components/videogular/videogular.min.js", dest: "snoopy/vendor/modules/videogular/videogular.min.js"},
            {src: "bower_components/videogular-controls/controls.min.js", dest: "snoopy/vendor/modules/videogular/plugins/controls.min.js"},
            {src: "bower_components/videogular-buffering/buffering.min.js", dest: "snoopy/vendor/modules/videogular/plugins/buffering.min.js"},
            {src: "bower_components/videogular-overlay-play/overlay-play.min.js", dest: "snoopy/vendor/modules/videogular/plugins/overlay-play.min.js"},
            {src: "bower_components/videogular-poster/poster.min.js", dest: "snoopy/vendor/modules/videogular/plugins/poster.min.js"},
            {src: "bower_components/videogular-ima-ads/ima-ads.min.js", dest: "snoopy/vendor/modules/videogular/plugins/ima-ads.min.js"},


        ]
    },
    dist: {
        files: [
            {expand: true, dest: 'snoopy/dist/', src:'**', cwd:'snoopy/'},
            {dest: 'snoopy/dist/index.html', src:'snoopy/index.min.html'}

        ]
    },
    toweb: {
        files: [
            {expand: true, dest: 'src/main/resources/static/', src:'css/**', cwd:'snoopy/dist/'},
            {expand: true, dest: 'src/main/resources/static/', src:'fonts/**', cwd:'snoopy/dist/'},
            {expand: true, dest: 'src/main/resources/static/', src:'img/**', cwd:'snoopy/dist/'},
            {expand: true, dest: 'src/main/resources/static/', src:'js/**', cwd:'snoopy/dist/'},
            {expand: true, dest: 'src/main/resources/static/', src:'l10n/**', cwd:'snoopy/dist/'},
            {expand: true, dest: 'src/main/resources/static/', src:'tpl/**', cwd:'snoopy/dist/'},
            { dest: 'src/main/resources/static/index.html', src:'snoopy/dist/index.html'}

        ]
    }
};