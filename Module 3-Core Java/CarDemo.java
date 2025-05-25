class Car {
    String make;
    String model;
    int year;

    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

public class CarDemo {
    public static void main(String[] args) {
    
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "civic";
        car1.year = 2020;

        Car car2 = new Car();
        car2.make = "Honda";
        car2.model = "Corolla";
        car2.year = 2025;

        car1.displayDetails();
        car2.displayDetails();
    }
}
