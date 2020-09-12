package ru.rtu.main;

public class Human {
    Head head;
    Leg leg;
    Hand hand;
    public Human(Head head, Leg leg, Hand hand){
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }
    public void setHeadRadius(){
        head.setHeadRadius();
    }
}
