package designpatterns.state.stuffedanimalvendingmachine;

public class DollarStuffedAnimalVendingMachineTestDrive {

	public static void main(String[] args) {
		DollarStuffedAnimalVendingMachine stuffedAnimalMachine = new DollarStuffedAnimalVendingMachine(10);

		System.out.println(stuffedAnimalMachine);

		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.dispense();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.dispense();

		System.out.println(stuffedAnimalMachine);

		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.dispense();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.dispense();

		System.out.println(stuffedAnimalMachine);

		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.dispense();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.dispense();

		System.out.println(stuffedAnimalMachine);

		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.dispense();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.insertQuarter();
		stuffedAnimalMachine.dispense();

		System.out.println(stuffedAnimalMachine);

	}
}
