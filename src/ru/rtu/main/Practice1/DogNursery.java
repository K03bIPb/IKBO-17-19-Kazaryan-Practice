package ru.rtu.main.Practice1;

public class DogNursery {
    int dogs_count = 10;
    int last_empty_place = 0;
    Dog[] dogs = new Dog[dogs_count];

    public void addDog(int age, String name) {
        dogs[last_empty_place].setAge(age);
        dogs[last_empty_place].setName(name);
        last_empty_place++;
    }

    public Dog[] getDogsList() {
        return dogs;
    }
}

