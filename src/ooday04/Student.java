package ooday04;

public class Student extends Person{
    String StuId;

    public Student(String name, int age, String address, String stuId) {
        super(name, age, address);
        StuId = stuId;
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("My student'id is: "+ StuId);
    }
}
