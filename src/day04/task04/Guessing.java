package day04.task04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = (int)(Math.random()*1000+1); //1到1000之内
        System.out.println(num);

        //300(大),200(小),250(对)
        System.out.println("猜: ");
        int guess = in.nextInt();
        while(guess!=num){
            if (guess!=num) {
                System.out.println("Wrong!");
                System.out.println("Please enter again:");
                guess=in.nextInt();
            }
            else {
                System.out.println("Your are right: " + num + "!");
                break;
            }
        }
    }
}
