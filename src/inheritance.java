class GasCar extends Car {

    public GasCar(String brand, String color) {
        super(brand, color);
    }
    @Override
    void startEngine() {
        System.out.println("Gas engine started with roar...");
    }
}

class ElectricCar extends Car {

    public ElectricCar(String brand, String color) {
        super(brand, color);
    }

    @Override
    void startEngine() {
        System.out.println("Electric motor started silently...");
    }
}
