package day06;

public class Test {
    public static void main(String[] args) {
        sayHi();
        say("Young man. ");
        sayHi("Jack",18);

        System.out.println(getNum());

        System.out.println("The result of 8 plus 5 is:\n " +plus(8,5));

        System.out.println("Print ten number between 1 and 100:");
        int[] arr=printArr();
        for (int e:
             arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void sayHi(){
        System.out.println("Hi!");
    }
    public static void say(String str){
        System.out.println(str);
    }
    public static void sayHi(String name, int age){
        System.out.println("My name is " +name+ ", I am " +age+ " years old.");
    }

    public static int plus(int num1, int num2){
        return num1+num2;
    }

    public static double getNum(){
        return 8.88;
    }

    public static int[] printArr(){
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*101);
        }
        return arr;
    }
}
