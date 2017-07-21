module.exports = {
  dist:{
    src:[
      'snoopy/vendor/jquery/jquery.min.js',
      'snoopy/vendor/angular/angular.js',
      'snoopy/vendor/angular/**/*.js',
      'snoopy/js/*.js',
      'snoopy/js/directives/*.js',
      'snoopy/js/services/*.js',
      'snoopy/js/filters/*.js',
      'snoopy/js/controllers/bootstrap.js'
    ],
    dest:'src/main/resources/static/dist/js/dist.js'
  }
}