package ru.rtu.main.Practice6;
import ru.rtu.main.Practice5.Rectangle;



class MovableRectangle extends Rectangle implements Movable {
    private Point center;
    public MovableRectangle(boolean isFilled, String color, double width, double height) {
        super(isFilled, color, width, height);
    }


    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void move(int right, int down) {
        center.move(right, down);
    }
}