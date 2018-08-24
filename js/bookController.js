(function () {
    'use strict';

    angular
        .module('bookapp')
        .controller('bookController', bookController);

        bookController.$inject = ['$scope','Book']; 

    function bookController($scope,Book) {
       
         $scope.Books = Book.query();
        $scope.result = "";
        $scope.saveBook = function() {
            // alert(JSON.stringify($scope.Book));
            //alert(JSON.stringify($scope.Employee)+"<-----------Test");
             //$scope.Employee.empid = 0;
             //$scope.Employee.Designation=Employee.Designation;
             
             Book.save($scope.Book,function(success){
              alert(JSON.stringify(success));
              $scope.result = JSON.stringify(success);
              window.location.href = '#/';
             },function(error){
               ////alert(JSON.stringify(error));
             });
             //window.location.href = '#/';
             
        }
        
        $scope.updateBook = function(){
            //alert(JSON.stringify($scope.Employee)+"<-----------Test");
           Book.update($scope.Book,function(success){
                //alert(JSON.stringify(success));
                $scope.result = JSON.stringify(success);
                window.location.href = '#/'; 
            },function(error){
                
            });
            //window.location.href = '#/';
        }
        
    
        $scope.deleteBook = function(){
            //alert(JSON.stringify($scope.Employee)+"<-----------Test");
            Book.remove($scope.Book,function(success){
            //alert(JSON.stringify(success));
            $scope.result = JSON.stringify(success);
                window.location.href = '#/';
            },function(error){
                
            });
           
        }
    }
 
})();
