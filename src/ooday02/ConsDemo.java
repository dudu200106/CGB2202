package ooday02;

public class ConsDemo {
    public static void main(String[] args) {
        Student stu=new Student();
        Student stu1=new Student("张三", 26,"beijing");

        stu.sayHi();
        stu1.sayHi();
    }
}
