package day05.task05;

public class MultiType {
    public static void main(String[] args) {
        System.out.println("九九乘法表:");
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i +"*"+ j +"="+ i*j +" ");
            }
            System.out.println();
        }
    }
}
