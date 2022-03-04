package day05.task05;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int score=0;
        for (int i = 0; i < 10; i++) {
            int a=(int)(100*Math.random());
            int b=(int)(100*Math.random());
            int res=a+b;
            System.out.println("Enter the result of: ");
            System.out.print(a+"+"+b+"=");
            int ans=in.nextInt();
            if (ans==res) {
                score+=10;
                System.out.println("Good! Right!!");
            }
            else if (ans==-1)
                break;
            else
                System.out.println("Wrong!");
        }
        System.out.println("Your final score is: " +score);
    }
}
