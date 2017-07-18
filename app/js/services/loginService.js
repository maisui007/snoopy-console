(function(angular){
    'use strict';
    angular.module('snoopyConsole').factory('AuthService', ['$http','Session','$log','$resource',function ($http,Session,$log) {
        var authService = {};

        authService.login = function (credentials) {
            $log.info("登录调用");
            //本地提供的服务，可用loopback快速搭建
            var api = $resource('http://localhost:8081/api/user_tests');

            //因为没有写服务端验证用户密码，使用save是为了方便；
            //这里，如果服务端已存在该credentials，返回的response会包含错误信息，可用来替代401、403等；
            return api.save(credentials)
                .$promise
                .then(function(res) {
                    Session.create(res.id, res.id,
                        res.Role);
                    return res;
                });
        };

        authService.isAuthenticated = function () {
            return !!Session.userId;
        };

        authService.isAuthorized = function (authorizedRoles) {
            if (!angular.isArray(authorizedRoles)) {
                authorizedRoles = [authorizedRoles];
            }
            return (authService.isAuthenticated() &&
            authorizedRoles.indexOf(Session.userRole) !== -1);
        };

        return authService;
    }]);
})(angular);