package ru.rtu.main.Practice3;

public class Head {
    private int head_weight;
    private int head_radius;
    public Head(int head_weight, int head_radius){
        this.head_radius = head_radius;
        this.head_weight =head_weight;
    }
    public void setHeadWeight(int head_weight){
        this.head_weight = head_weight;
    }
    public void setHeadRadius(int head_radius){
        this.head_radius = head_radius;
    }
    public int getHeadWeight(){
        return head_weight;
    }
    public int getHeadRadius(){
        return head_radius;
    }

    @Override
    public String toString() {
        return "Head{" +
                "head_weight=" + head_weight +
                ", head_radius=" + head_radius +
                '}';
    }
}
