angular.module('app')
    .controller('NRentController', function (Rents, Rents) {
        var vm = this;
        vm.rent = new Rent();
        vm.saveRent = function () {
            Rents.add(vm.rent);
            vm.rent = new Rent();
        }
    });