package day04.task04;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scan.nextInt();
        System.out.println("请输入月份:");
        int month = scan.nextInt();
        int days = 0; //天数

        int[] months= {0,31,28,31,30,31,30,31,31,30,31,30,31};
        days=months[month];
        if (year%4==0&&year%100!=0||year%400==0)
            days=29;

        System.out.println("The days of "+year+"/"+month+ " is: " +days);
    }
}
