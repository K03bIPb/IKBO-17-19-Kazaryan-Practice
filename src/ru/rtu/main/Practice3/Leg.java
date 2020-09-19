package ru.rtu.main.Practice3;

public class Leg {
    private boolean which_leg;
    private double leg_weight;
    private double leg_sizeEU;
    public Leg(boolean which_leg, double leg_weight, double leg_sizeEU){
        this.which_leg = which_leg;
        this.leg_weight = leg_weight;
        this.leg_sizeEU = leg_sizeEU;
    }
    public void setWhichLeg(boolean which_leg){
        this.which_leg = which_leg;
    }
    public void setLegWeight(double leg_weight){
        this.leg_weight = leg_weight;
    }
    public void setLegSizeEU(double leg_sizeEU){
        this.leg_sizeEU = leg_sizeEU;
    }
    public boolean getWhichLeg(){
        return which_leg;
    }
    public double getLegWeight(){
        return leg_weight;
    }
    public double getLegSizeEU(){
        return leg_sizeEU;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "which_leg=" + which_leg +
                ", leg_weight=" + leg_weight +
                ", leg_sizeEU=" + leg_sizeEU +
                '}';
    }
}
