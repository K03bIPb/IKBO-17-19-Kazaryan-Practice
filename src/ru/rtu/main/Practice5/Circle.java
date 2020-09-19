package ru.rtu.main.Practice5;

public class Circle extends Shape {
    private double radius;
    public Circle(boolean isFilled, String color, double radius) {
        super(isFilled, color);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

