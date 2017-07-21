module.exports = {
	min: {
      files: [{
          expand: true,
          cwd: 'snoopy/tpl/',
          src: ['*.html', '**/*.html'],
          dest: 'src/main/resources/static/dist/tpl/',
          ext: '.html',
          extDot: 'first'
      }]
  }
}