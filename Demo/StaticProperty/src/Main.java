public class Main{
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Ford Fusion","GM FIREfly");
        System.out.println(Car.numberOfCars);
    }
}