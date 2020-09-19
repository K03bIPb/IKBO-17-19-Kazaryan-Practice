package ru.rtu.main.Practice3;

public class Human {
    private Head head;
    private Leg leg;
    private Hand hand;
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
