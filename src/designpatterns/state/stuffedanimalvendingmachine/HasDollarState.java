package designpatterns.state.stuffedanimalvendingmachine;

import java.util.Random;

public class HasDollarState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	DollarStuffedAnimalVendingMachine stuffedAnimalMachine;

	public HasDollarState(DollarStuffedAnimalVendingMachine stuffedAnimalMachine) {
		this.stuffedAnimalMachine = stuffedAnimalMachine;
	}

	public void insertCoin(Coin coin) {
		System.out.println("You can't insert another " + coin.desc);
	}

	public void ejectCoin() {
		System.out.println("Quarter returned");
		stuffedAnimalMachine.setState(stuffedAnimalMachine.getNoDollarState());
	}

	public void dispense() {
		int winner = randomWinner.nextInt(5);
		if ((winner == 0) && (stuffedAnimalMachine.getCount() > 1)) {
			stuffedAnimalMachine.setState(stuffedAnimalMachine.getWinnerState());
			stuffedAnimalMachine.dispense();
		} else {
			stuffedAnimalMachine.setState(stuffedAnimalMachine.getSoldState());
			stuffedAnimalMachine.dispense();
		}
	
	}

	public void refill() {
	}

	public String toString() {
		return "waiting for turn of crank";
	}
}
