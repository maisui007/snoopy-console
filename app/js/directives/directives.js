(function(angular){
    'use strict';
    var appConsole = angular.module('snoopyConsole');
    appConsole.directive('snoopyConsole',['consoleConfig',function(consoleConfig){
        return{
            restrict:'EA',
            templateUrl:consoleConfig.templatesPath+'login.html'
        }
    }]);


})(angular);