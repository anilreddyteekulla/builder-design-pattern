package designpatterns.state.stuffedanimalvendingmachine;

public class DollarStuffedAnimalVendingMachine {

	State noDollarState;
	State hasDollarState;
	State soldState;
	State soldOutState;
	State winnerState;

	State state = soldOutState;
	int count = 0;
	int balance = 0;

	public DollarStuffedAnimalVendingMachine(int numStuffedAnimals) {
		soldOutState = new SoldOutState(this);
		noDollarState = new NoDollarState(this);
		hasDollarState = new HasDollarState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);

		this.count = numStuffedAnimals;
		if (numStuffedAnimals > 0) {
			state = noDollarState;
		}
	}

	public void insertQuarter() {
		state.insertCoin(Coin.QUARTER);
	}

	public void ejectQuarter() {
		state.ejectCoin();
	}

	public void dispense() {
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void dispenseStuffedAnimal() {
		System.out.println("Please collect your toy\n");
		if (count > 0) {
			count = count - 1;
		}
	}

	int getCount() {
		return count;
	}

	void refill(int count) {
		this.count += count;
		System.out.println("The stuffed animal vending machine was just refilled; its new count is: " + this.count);
		state.refill();
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoDollarState() {
		return noDollarState;
	}

	public State getHasDollarState() {
		return hasDollarState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nStuffed animal inventory: " + count + " stuffed animal(s)");
		result.append("\n");
		result.append("Vending machine is " + state + "\n");
		return result.toString();
	}
}
