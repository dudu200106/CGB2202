package day04.task04;

import java.util.Random;
import java.util.Scanner;

public class Guessing02 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num= (int)(100*Math.random());
        System.out.println("Random number: " + num);
        System.out.println("Guess:");
        int g=in.nextInt();

        do {
            if (g==num) {
                System.out.println("Your are right: " + num + "!");
                break;

            }
            else {
                System.out.println("Wrong!");
                System.out.println("Guess again:");
                num=(int)(100*Math.random());
                System.out.println("Random number: " + num);

                System.out.println("Guess:");
                g=in.nextInt();
            }
        }while (g!=num);
    }
}
