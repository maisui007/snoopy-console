(function(angular){
    'use strict';
    angular.module('snoopyConsole').controller('LoginController', function($scope, $rootScope,AuthService,AUTH_EVENTS,$log) {
        $scope.credentials = {
            username : '',
            password : ''
        };
        $scope.login = function(credentials) {
            $log.info(credentials);
            console.log('login', credentials);
            AuthService.login(credentials).then(function(user) {
                $rootScope.$broadcast(AUTH_EVENTS.loginSuccess);
                $scope.$parent.setCurrentUser(user);
            }, function() {
                $rootScope.$broadcast(AUTH_EVENTS.loginFailed);
            });
        };
    })
})(angular);