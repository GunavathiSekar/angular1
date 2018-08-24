(function () {
    'use strict';

    angular.module('bookapp', [
        // Angular modules 
        'ngRoute','ngResource'

        // Custom modules 
        
        // 3rd Party Modules
        
    ]).config(['$routeProvider', function ($routeProvider) {
  $routeProvider
    .when("/", { templateUrl: "partial/details.html", controller: "bookController" })
    .when("/create", { templateUrl: "partial/create.html", controller: "bookController" })
    .when("/update", { templateUrl: "partial/Update.html", controller: "bookController" })
    .when("/delete", { templateUrl: "partial/delete.html", controller: "bookController" })
    .when("/getbook", { templateUrl: "partial/getbyid.html", controller: "bookController" })
    .otherwise("/404", {templateUrl: "partials/404.html"});
}]);
})();