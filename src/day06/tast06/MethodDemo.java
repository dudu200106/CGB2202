package day06.tast06;

public class MethodDemo {
    public static void main(String[] args) {
        say();
        sayHi("Sean"); //String name="zhangsan"
        sayHello("Sean",25); //String name="zhangsan",int age=25
    }

    public static void say(){
        System.out.println("hi, my name is Sean");
    }

    public static void sayHi(String name){
        System.out.println("大家好，我叫"+name+"，今年20岁了");
    }

    public static void sayHello(String name,int age){
        if(age>20){
            System.out.println("Too old enough!");
            return;
        }
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了");
    }
}
