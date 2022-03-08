package ooday01;

public class Student {
    private String name;
    private int age=0;
    private String address;

    public Student(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public Student() {

    }

    void study(){
        System.out.println(name+ "  is studying recently.");
    }

    void sayHi(){
        System.out.println("Hello, my name is " +name+ ", and I am " +age+ " years old. I living in " +address);
    }
}
