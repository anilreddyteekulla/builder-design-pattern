package designpatterns.state.stuffedanimalvendingmachine;

public enum Coin {
	QUARTER("quarter");

	public final String desc;

	Coin(String desc) {
		this.desc = desc;
	}
}
