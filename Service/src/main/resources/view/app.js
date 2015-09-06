
var app = angular.module('myApp', []);
app.controller('customersController', ['$http', function ($http) {
        var ctrl = this;
        this.edit = false;
        $http.get("http://localhost:9000/employees")
                .success(function (data) {
                    ctrl.employees = data;
                });
        
        this.editUser = function (employee) {
            ctrl.edit = true;  
//            $http.post("http://localhost:9000/employees/add", employee);
        };
        
        this.newUser = function(){
            console.log("newUser");
          ctrl.edit = false;  
        };
        
    }]);