package designpatterns.state.stuffedanimalvendingmachine;

public class BearStuffedAnimalBuilder extends StuffedAnimalBuilder {
	public BearStuffedAnimalBuilder() {
		this.name = "Bear";
	}

	public StuffedAnimalBuilder addFabric(String fabric) {
		this.fabric = fabric;
		return this;
	}


	public StuffedAnimalBuilder addStuffing(String stuffing) {
		this.stuffings.add(stuffing);
		return this;
	}

	public StuffedAnimalBuilder addColor(String color) {
		this.color = color;
		return this;
	}

}
