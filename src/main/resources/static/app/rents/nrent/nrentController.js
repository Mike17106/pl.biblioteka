angular.module('app')
.controller('NrentController', function(Rents, rent) {
	var vm = this;
	vm.rent = new Rent();
	vm.saveRent = function() {
		Rent.add(vm.rent);
		vm.rent = new Rent();
	}
});