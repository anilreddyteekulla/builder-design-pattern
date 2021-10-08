package designpatterns.state.stuffedanimalvendingmachine;

import java.util.ArrayList;
import java.util.List;

public class StuffedAnimal {
	private  String name;
	private  String fabric;
	private  List<String> stuffings = new ArrayList<String>();
	private  String color;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public void setStuffing(List<String> stuffings) {
		this.stuffings = stuffings;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void prepare() {
        System.out.println("*** Assembling stuffed " + name + " animal ***");
        System.out.println("1. Preparing " + this.color + " " + this.fabric + " fabric.");
        System.out.println("2. Sewing " + this.fabric + " fabric.");
        System.out.println("3. Stuffing " + this.name + " animal with " + this.stuffings.toString());
    }
	
	@Override
    public String toString() {
        return this.color +
                " " + this.fabric +
                " " + this.name +
                " stuffed with " + this.stuffings.toString() +
                " is ready.\n";
    }

}
