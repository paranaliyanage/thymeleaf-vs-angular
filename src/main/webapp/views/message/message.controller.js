'use strict';

angular.module('angularApp').controller('messageController', function ($scope, $http) {
    $http.get('message').
        then(function(response) {
            $scope.messages = response.data;
        });
});
