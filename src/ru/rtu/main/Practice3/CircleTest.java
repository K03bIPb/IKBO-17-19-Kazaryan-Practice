package ru.rtu.main.Practice3;

public class CircleTest {
    public static void main(String[] args) {
        int n = 10;
        double arg_radius1 = Double.parseDouble(args[0]);
        double arg_radius2 = Double.parseDouble(args[1]);
        Circle circle = new Circle(arg_radius1);
        System.out.println(circle.toString());
        circle.setRadius(arg_radius2);
        System.out.println(circle.toString());
        double out_radius = circle.getRadius();
        System.out.println(out_radius);


    }
}
