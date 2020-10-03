package ru.rtu.main.Practice9.inClassWork;

import java.util.ArrayList;

public class CarSalon {
    private ArrayList<Car> cars = new ArrayList<>();
    public void  addCar(Car car){
        cars.add(car);
    }
    public void printSomeCars(Car car){

    }

    @Override
    public String toString() {
        return "CarSalon{" +
                "cars=" + cars +
                '}';
    }
}
