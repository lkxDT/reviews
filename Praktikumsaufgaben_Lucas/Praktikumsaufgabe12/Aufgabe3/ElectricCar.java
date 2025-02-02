import java.io.Serializable;

public class ElectricCar extends Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private int batteryCapacity;

    public ElectricCar(String brand, String model, String color, int maxSpeed, int batteryCapacity) {
        super(brand, model, color, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(String brand, String model) {
        super(brand, model, "Black", 180);
        this.batteryCapacity = 60;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
    // ...existing code...
}
