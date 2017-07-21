module.exports = {
	min: {
      files: [{
          expand: true,
          cwd: 'snoopy/tpl/',
          src: ['*.html', '**/*.html'],
          dest: 'snoopy/dist/tpl/',
          ext: '.html',
          extDot: 'first'
      }]
  }
}