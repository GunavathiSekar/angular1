(function () {
    'use strict';
    var bookService = angular.module('bookapp');
    bookService.factory('Book', ['$resource',
    function ($resource) {
        
        return $resource('books/:id', {id:'@id'},
         {
             save:{method:"POST"},
             update:{method:"POST"},
             remove:{method:"DELETE"}
            
        });
    }
    ]);
})();