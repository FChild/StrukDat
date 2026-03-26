public class main {
    public static void main(String[] args) {

        Car car1 = new GasCar("Toyota", "Red");
        Car car2 = new ElectricCar("Tesla", "Blue");

        car1.startEngine();
        car2.startEngine();
}
}