package DesignPatternSingleton;

public class CarProducer {
    private static CarProducer carProducerInstance;
    private  int numberOfCarsProduced;

    private CarProducer() {
    }

    public static CarProducer getCarProducerInstance() {
        if (carProducerInstance == null) {
            carProducerInstance = new CarProducer();
        }
        return carProducerInstance;
    }

    public void printNumberOfCarsProduced() {
        System.out.println("we porduced " + numberOfCarsProduced);
    }

    public Car produceCar() {
        Car car = new Car();
        numberOfCarsProduced++;
        return new Car();
    }
}
