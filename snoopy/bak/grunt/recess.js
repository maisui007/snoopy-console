module.exports = {
	app: {
        files: {
          'snoopy/css/app.css': [
            'snoopy/css/less/app.less'
          ]
        },
        options: {
          compile: true
        }
    },
    min: {
        files: {
            'src/main/resources/static/dist/css/app.min.css': [
                'snoopy/css/bootstrap.css',
                'snoopy/css/*.css'
            ]
        },
        options: {
            compress: true
        }
    }
}