angular.module('app')
.controller('RentDetailsController', function($routeParams, Rents) {
	var vm = this;
	var rentIndex = $routeParams.id;
	vm.rent = Rents.get(rentIndex);
});