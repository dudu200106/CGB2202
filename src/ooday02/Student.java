package ooday02;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public Student() { //this关联调用成员方法;
        this("null",0,"no home");
    }

    void study(){
        System.out.println(name+ "  is studying recently.");
    }

    void sayHi(){
        System.out.println("Hello, my name is " +this.name+ ", and I am " +age+ " years old. I living in " +address);
    }

}
