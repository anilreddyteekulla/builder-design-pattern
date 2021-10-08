package designpatterns.state.stuffedanimalvendingmachine;

import java.util.ArrayList;
import java.util.List;

public abstract class StuffedAnimalBuilder {
	String name;
	String fabric;
	String color;
	List<String> stuffings = new ArrayList<>();

	public abstract StuffedAnimalBuilder addFabric(String fabric);
	public abstract StuffedAnimalBuilder addStuffing(String stuffing);
	public abstract StuffedAnimalBuilder addColor(String color);
	public StuffedAnimal build() {
		StuffedAnimal stuffedAnimal = new StuffedAnimal();
		stuffedAnimal.setName(this.name);
		stuffedAnimal.setFabric(this.fabric);
		stuffedAnimal.setColor(this.color);
		stuffedAnimal.setStuffing(this.stuffings);
		return stuffedAnimal;
	}


}
