package ooday04;

public class Doctor extends Person {
    String level;

    public Doctor(String name, int age, String address, String level) {
        super(name, age, address);
        this.level = level;
    }

    @Override
    void sayHi() {
        super.sayHi();
        System.out.println("My status is: "+ level);
    }
}
