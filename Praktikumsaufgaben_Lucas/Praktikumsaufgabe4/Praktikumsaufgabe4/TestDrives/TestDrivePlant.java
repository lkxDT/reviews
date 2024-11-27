package TestDrives;

import Classes.Plant;

public class TestDrivePlant extends AbstractTestDrive{

	private Plant testPlant;


	public TestDrivePlant(Plant testPlant){

		this.testPlant = testPlant;
	}


	public void testDeklarations(){

		//1.1

		System.out.println("Task 1.1:");

		this.testPlant.setHeight(10.0);
		this.testPlant.setType("Löwenzahn");
		this.testPlant.setWaterLevel(2);

		System.out.println(this.testPlant.getHeight());
		
		System.out.println(this.testPlant.getType());
		
		System.out.println(this.testPlant.getWaterLevel());

		System.out.println();
		
	}


	public void testMethods(){

		//1.2
		
		System.out.println("Task 1.2:");

		System.out.println("The height of your plant before growing is " + this.testPlant.getHeight());

		this.testPlant.grow(24);

		System.out.println("The height of your plant after growing with 24 sunlight hours is "  + this.testPlant.getHeight());

		System.out.println();


		//1.3

		System.out.println("Tasks 1.3:");

		for (int i = 0; i < 5; i++){

			this.testPlant.grow(i);

			System.out.println("Current height: " + this.testPlant.getHeight());
		}
		
		System.out.println();


		//2.1.2

		System.out.println("Tasks 2.1.2:");

		for (int i = 0; i < 5; i++) {

			this.testPlant.water(i);
			
			System.out.println("Current waterlevel: " + this.testPlant.getWaterLevel());
		}
		
		System.out.println();

		//2.2.2 & 2.3
		System.out.println("Task 2.2.2 & 2.3:");
		int sufficientWaterLevel = 5;
		this.testPlant.setWaterLevel(0);

		while (this.testPlant.getWaterLevel() < sufficientWaterLevel){
			System.out.println("Current waterlevel: " + this.testPlant.getWaterLevel());
			if (this.testPlant.needsWater()){ 
				System.out.println("This plant needs water!");
				System.out.println();
				this.testPlant.water(1);
			}
		}

		System.out.println();


		//3
		System.out.println("Task 3 - Getter and Setter:");
		this.testPlant.setWaterLevel(11);
		this.testPlant.setHeight(-1);
		System.out.println();
		//pio gar kein Test ...
		//pio System.out.println" ... WaterLevel ... //alt Computer Arbeit machen lasse ... if


		//4.2
		
		System.out.println("Task 4.2:");

		Plant plant1 = new Plant(1.0, "cactus", 3);
		Plant plant2 = new Plant(1.0, "cactus", 3);

		System.out.println(plant1 == plant2); //pio Ausgabe sagt nicht

		System.out.println();

		//4.3

		System.out.println("Task 4.3:");

		plant1.setType("rose");

		System.out.println();

		System.out.println(".equals for the different plant types:");

		System.out.println(plant1.getType().equals(plant2.getType()));

		plant2.setType("rose");

                System.out.println();

                System.out.println(".equals for the same plant types:");

                System.out.println(plant1.getType().equals(plant2.getType())); //pio besser lesen
									       //pio plant1.equals(plant2); //pio besser lesen
									       //pio plant1.equals(plant2);

	}
}
