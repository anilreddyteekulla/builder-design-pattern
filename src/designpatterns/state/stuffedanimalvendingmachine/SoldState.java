package designpatterns.state.stuffedanimalvendingmachine;

public class SoldState implements State {
	DollarStuffedAnimalVendingMachine stuffedAnimalMachine;

	public SoldState(DollarStuffedAnimalVendingMachine stuffedAnimalMachine) {
		this.stuffedAnimalMachine = stuffedAnimalMachine;
	}

	public void insertCoin(Coin coin) {
		System.out.println("Please wait, we're already giving you a toy");
	}

	public void ejectCoin() {
		System.out.println("Sorry, you already got a toy");
	}

	public void dispense() {
		stuffedAnimalMachine.dispenseStuffedAnimal();
		if (stuffedAnimalMachine.getCount() > 0) {
			stuffedAnimalMachine.setState(stuffedAnimalMachine.getNoDollarState());
		} else {
			System.out.println("Sorry, out of stuffed animals!");
			stuffedAnimalMachine.setState(stuffedAnimalMachine.getSoldOutState());
		}
	}

	public void refill() {
	}

	public String toString() {
		return "dispensing a toy";
	}
}
