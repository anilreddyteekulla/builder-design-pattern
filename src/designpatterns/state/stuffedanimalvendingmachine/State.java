package designpatterns.state.stuffedanimalvendingmachine;

public interface State {

	public void insertCoin(Coin coin);

	public void ejectCoin();

	public void dispense();

	public void refill();
}
