package ru.rtu.main;

public class Human {
    public Head head;
    public Leg leg;
    public Hand hand;
    public Human(Head head, Leg leg, Hand hand){
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Human{" +
                "head=" + head +
                ", leg=" + leg +
                ", hand=" + hand +
                '}';
    }
}
