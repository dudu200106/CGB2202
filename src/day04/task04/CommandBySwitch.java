package day04.task04;

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择功能: 1.取款  2.存款  3.查询余额  0.退卡");
        int command = scan.nextInt();

        switch (command){
            case 1:
                System.out.println("withdraw");
                break;
            case 2:
                System.out.println("deposit");
                break;
            case 3:
                System.out.println("query balance");
                break;
            case 0:
                System.out.println("return the card");
                break;
        }
    }
}
