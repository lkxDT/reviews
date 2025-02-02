import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarSerializer {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", "red", 120); // initialize with appropriate values
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", "red",120, 75); // initialize with appropriate values

        try (FileOutputStream fileOut = new FileOutputStream("cars.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(car);
            out.writeObject(electricCar);
            System.out.println("Serialization successful");
        } catch (IOException e) {
            System.err.println("Serialization failed");
        }
    }
}
