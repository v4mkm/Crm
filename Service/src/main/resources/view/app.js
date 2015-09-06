
var app = angular.module('myApp', []);
app.controller('customersController', ['$http', function ($http) {
        var ctrl = this;
        $http.get("http://localhost:9000/employees")
                .success(function (data) {
                    ctrl.employees = data;
                });
        this.editUser = function (employee) {
            $http.post("http://localhost:9000/employees/add", employee);
        };
    }]);