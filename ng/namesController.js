// angular.module('myApp', []).controller('namesCtrl', function($scope) {
//     $scope.names = [
//         {name:'Jani',country:'Norway'},
//         {name:'Hege',country:'Sweden'},
//         {name:'Kai',country:'Denmark'}
//     ];
// });

// angular.module('myApp1', []).controller('namesCtrl1', function($scope) {
//     $scope.username = 'vani';
// });


var app = angular.module('myApp', []);

app.controller('namesCtrl', function($scope) {
    $scope.names = [
        {name:'Jani',country:'Norway',image:'download'},
        {name:'Hege',country:'Sweden',image:'gunavathi'},
        {name:'Kai',country:'Denmark',image:'images'}
    ];
});

app.controller('namesCtrl1', function($scope) {
    $scope.username = 'vani';
});