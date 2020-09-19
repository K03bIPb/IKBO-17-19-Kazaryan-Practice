package ru.rtu.main.Practice5;

abstract public class Shape {
    private boolean isFilled;
    private String color;

    public Shape(boolean isFilled, String color) {
        this.isFilled = isFilled;
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }
    abstract double getArea();

    public String getColor() {
        return color;
    }


}
