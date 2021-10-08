package designpatterns.state.stuffedanimalvendingmachine;

public class SoldOutState implements State {
	DollarStuffedAnimalVendingMachine stuffedAnimalMachine;

	public SoldOutState(DollarStuffedAnimalVendingMachine stuffedAnimalMachine) {
		this.stuffedAnimalMachine = stuffedAnimalMachine;
	}

	public void insertCoin(Coin coin) {
		System.out.println("You can't insert a " + coin.desc + ", the machine is sold out");
	}

	public void ejectCoin() {
		System.out.println("You can't eject, you haven't inserted a coin yet");
	}

	public void dispense() {
		System.out.println("No toy dispensed");
	}

	public void refill() {
		stuffedAnimalMachine.setState(stuffedAnimalMachine.getNoDollarState());
	}

	public String toString() {
		return "sold out";
	}
}
