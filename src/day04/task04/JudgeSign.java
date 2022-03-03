package day04.task04;

import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = in.nextInt();
        System.out.println(num);

        if (num>0)
            System.out.println("+");
        else if (num<0)
            System.out.println("-");
        else
            System.out.println("0");
    }
}
