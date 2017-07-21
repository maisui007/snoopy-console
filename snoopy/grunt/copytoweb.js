module.exports = {
    toweb: {
        files: [
            {expand: true, dest: 'src/main/resources/static/dist/css/', src:'dist/css/**', cwd:'snoopy/'},
            {expand: true, dest: 'src/main/resources/static/dist/css/', src:'dist/fonts/**', cwd:'snoopy/'},
            {expand: true, dest: 'src/main/resources/static/dist/img/', src:'dist/img/**', cwd:'snoopy/'},
            {expand: true, dest: 'src/main/resources/static/dist/js/', src:'dist/js/**', cwd:'snoopy/'},
            {expand: true, dest: 'src/main/resources/static/dist/l10n/', src:'dist/l10n/**', cwd:'snoopy/'},
            {expand: true, dest: 'src/main/resources/static/dist/tpl/', src:'dist/tpl/**', cwd:'snoopy/'},
            {expand: true, dest: 'src/main/resources/static/index.html', src:'dist/index.html', cwd:'snoopy/'}

        ]
    }
};