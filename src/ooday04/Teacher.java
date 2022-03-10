package ooday04;

public class Teacher extends Person {
    int salary;

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("My salary is: "+ salary +"$ per month.");

    }
}
