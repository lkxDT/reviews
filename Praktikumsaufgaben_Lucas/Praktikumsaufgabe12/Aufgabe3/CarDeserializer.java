import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarDeserializer {
    public static void main(String[] args) {
        try (FileInputStream fileIn = new FileInputStream("cars.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Car car = (Car) in.readObject();
            ElectricCar electricCar = (ElectricCar) in.readObject();

            System.out.println("Deserialization successful");
            car.printInfo();
            System.out.println("");
            electricCar.printInfo();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization failed");
        }
    }
}
