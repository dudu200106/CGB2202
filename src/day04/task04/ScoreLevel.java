package day04.task04;

import java.util.Scanner;

public class ScoreLevel {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter your Score: ");
        double score =in.nextDouble();

        if(score<0 || score>100){
            System.out.println("成绩不合法");
        }else if(score>=90){ //合法
            System.out.println("A-优秀");
        }else if(score>=80){
            System.out.println("B-良好");
        }else if(score>=60){
            System.out.println("C-中等");
        }else{
            System.out.println("D-不及格");
        }
    }

}
