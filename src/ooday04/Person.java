package ooday04;

public class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void sayHi(){
        System.out.println("Hi, my name is " +name+ ", and I am " +age+ " years old, I live in " +address);
    }
}
