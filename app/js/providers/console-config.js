(function(angualr){
    'use strict';
    angualr.module('snoopyConsole').provider('consoleConfig',function(){
        var values = {
            appName : 'snoopy-console-default',
            defaultLang :'en',

            loginUrl: '/snoop/login/',

            templatesPath:'app/template'
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