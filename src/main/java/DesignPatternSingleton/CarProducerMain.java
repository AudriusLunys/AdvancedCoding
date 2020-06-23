package DesignPatternSingleton;

import java.util.ArrayList;
import java.util.List;

public class CarProducerMain {
    public static void main(String[] args) {
        CarProducer carProducer = CarProducer.getCarProducerInstance();
        carProducer.printNumberOfCarsProduced();

        Car audi = carProducer.produceCar();
        carProducer.printNumberOfCarsProduced();
        Car audi100 = carProducer.produceCar();
        carProducer.printNumberOfCarsProduced();

        List<Car> cars = new ArrayList<>();
        cars.add(audi);
        cars.add(audi100);



    }
}
