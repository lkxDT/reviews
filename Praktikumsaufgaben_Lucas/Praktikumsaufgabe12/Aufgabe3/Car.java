import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 1L;
    private String brand;
    private String model;
    private String color;
    private int maxSpeed;

    public Car(String brand, String model, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public Car(String brand, String model) {
        this(brand, model, "Black", 180);
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
    // ...existing code...
}
