angular.module('app')
    .controller('RListController', function (Rents) {
        var vm = this;
        vm.Rents = Rents.getAll();
        console.log('lista załadowana');
        console.log(vm.Rents)
    });