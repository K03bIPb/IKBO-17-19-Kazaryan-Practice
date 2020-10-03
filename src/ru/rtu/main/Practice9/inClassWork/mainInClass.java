package ru.rtu.main.Practice9.inClassWork;

public class mainInClass {
    public static void main(String[] args) {
        CarSalon salon = new CarSalon();
        for (int i = 0; i < 100; i++) {
            salon.addCar(new Car("lada", "kalina", (int) (Math.random() % 5  +2000), Math.random()%1000+5));
        }

    }
}


