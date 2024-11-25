public class PlantTestDrive {
    public static void main(String[] args){
        Plant testPlant = new Plant(3.65, "Gras", 2);


        System.out.println(String.format(
            "The plant of the type %s is %2f cm hight. The waterlevel is at %d %%.",
            testPlant.getType(),
            testPlant.getHeight(),
            testPlant.getWaterLevel()
        ));
        

        testPlant.grow(3);

        if (testPlant.needsWater()){
            testPlant.water(20);
            System.out.println("Die Pflanze musste bewässert werden.");;
        }

        testPlant.setHeight(-3.4);
        testPlant.setWaterLevel(-4);


        System.out.println(String.format(
            "The plant of the type %s is %2f cm hight. The waterlevel is at %d %%.",
            testPlant.getType(),
            testPlant.getHeight(),
            testPlant.getWaterLevel()
        ));

        double height1 = 4;
        double height2 = 4;

        if(height1 == height2)
            System.out.println("The heights are the same");
        
        Plant plant1 = new Plant(1.0, "cactus", 3);
        Plant plant2 = new Plant(1.0, "cactus", 3);

        System.out.println(plant1==plant2);

        plant2.setType("rose");

        System.out.println(plant1.getType().equals(plant2.getType()));

        plant2.setType("cactus");

        System.out.println(plant1.getType().equals(plant2.getType()));
    }
}
