package designpatterns.state.stuffedanimalvendingmachine;

public class NoDollarState implements State {
	DollarStuffedAnimalVendingMachine stuffedAnimalMachine;

	int numOfQuarters = 4;

	public NoDollarState(DollarStuffedAnimalVendingMachine stuffedAnimalMachine) {
		this.stuffedAnimalMachine = stuffedAnimalMachine;
	}

	public void insertCoin(Coin coin) {
		stuffedAnimalMachine.balance = stuffedAnimalMachine.balance + 1;
		System.out.println("You inserted " + stuffedAnimalMachine.balance + " " + coin.desc + "(s)");
		if (stuffedAnimalMachine.balance == numOfQuarters) {
			stuffedAnimalMachine.setState(stuffedAnimalMachine.getHasDollarState());
			stuffedAnimalMachine.balance = 0;
		}
	}

	public void ejectCoin() {
		System.out.println("You haven't inserted a coin");
	}

	public void dispense() {
		System.out.println("Insert 4 quarters");
	}

	public void refill() {
	}

	public String toString() {
		return "ready to accept coins";
	}

}
