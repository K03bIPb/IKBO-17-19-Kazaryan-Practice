package ru.rtu.main.Practice3;

public class HumanTest {
    public static void main(String[] args) {
        Leg leg = new Leg(false, 20, 43);//left leg - false, right leg - true
        Hand hand = new Hand(false, 15, 70);//left hand - false, right hand - true
        Head head = new Head(10, 20);
        Human human = new Human(head, leg, hand);
        String out_info = human.toString();
        System.out.println(out_info);
    }
}
