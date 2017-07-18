(function(angular){
    'use strict';
    angular.module('snoopyConsole').directive('snoopyMain',['consoleConfig',function(consoleConfig){
        return {
            restrict: 'EA',
            //template : '<h1>自定义指令!</h1>'
            //templateUrl:'app/templates/login.html'
            templateUrl:consoleConfig.templatesPath+'/login.html'
        };
    }]);
})(angular);