package day04.task04;

public class SumFrom1To100 {
    public static void main(String[] args) {
        int res=0;
        for (int i = 1; i <= 100; i++) {
            res+=i;
        }
        System.out.println("The sum from 1 to 100 is: " + res);
    }

}
