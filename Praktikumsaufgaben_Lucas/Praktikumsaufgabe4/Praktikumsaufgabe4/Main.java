import TestDrives.*;
import Classes.*;

public class Main{

	public static void main(String[] args){

		Plant plant = new Plant(1.0, "Rose", 1);

		TestDrivePlant testForPlants = new TestDrivePlant(plant);

		testForPlants.testDeklarations();

		testForPlants.testMethods();
	}
}
