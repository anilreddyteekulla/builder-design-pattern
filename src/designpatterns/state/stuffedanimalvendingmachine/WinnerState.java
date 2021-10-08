package designpatterns.state.stuffedanimalvendingmachine;

public class WinnerState implements State {
    DollarStuffedAnimalVendingMachine stuffedAnimalMachine;
 
    public WinnerState(DollarStuffedAnimalVendingMachine stuffedAnimalMachine) {
        this.stuffedAnimalMachine = stuffedAnimalMachine;
    }
 
	public void insertCoin(Coin coin) {
		System.out.println("Please wait, we're already giving you a toy");
	}
 
	public void ejectCoin() {
		System.out.println("Please wait, we're already giving you a toy");
	}
 
 
	public void dispense() {
		stuffedAnimalMachine.dispenseStuffedAnimal();
		if (stuffedAnimalMachine.getCount() == 0) {
			stuffedAnimalMachine.setState(stuffedAnimalMachine.getSoldOutState());
		} else {
			StuffedAnimalBuilder bearStuffedAnimalBuilder = new BearStuffedAnimalBuilder();
			StuffedAnimal stuffedAnimal = bearStuffedAnimalBuilder.addFabric("plush")
					.addColor("brown")
					.addStuffing("cotton")
					.addStuffing("beans")
					.build();
			stuffedAnimal.prepare();
			stuffedAnimal.toString();
			stuffedAnimalMachine.dispenseStuffedAnimal();
			System.out.println("YOU'RE A WINNER! You got two toys for your dollar\n");
			if (stuffedAnimalMachine.getCount() > 0) {
				stuffedAnimalMachine.setState(stuffedAnimalMachine.getNoDollarState());
			} else {
            	System.out.println("Sold out!");
				stuffedAnimalMachine.setState(stuffedAnimalMachine.getSoldOutState());
			}
		}
	}
 
	public void refill() { }
	
	public String toString() {
		return "despensing two toys for your dollar, because YOU'RE A WINNER!";
	}
}