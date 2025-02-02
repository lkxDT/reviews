public class ElectricCarTest {
    public static void main(String[] args) {
        ElectricCar electricCar1 = new ElectricCar("Tesla", "Model 3", "Blue", 240, 75);
        electricCar1.printInfo();

        ElectricCar electricCar2 = new ElectricCar("Nissan", "Leaf");
        electricCar2.printInfo();
    }
}
