(function(angular){
    'use strict';
    angular.module('snoopyConsole').provider('consoleConfig',function(){
        var values = {
            appName : 'snoopy-console-default',
            defaultLang :'en',
            loginUrl: '/snoop/login/',
            templatesPath:'app/templates'
        };

        return {
            $get: function() {
                return values;
            },
            set: function (constants) {
                angular.extend(values, constants);
            }
        };
    });
})(angular);