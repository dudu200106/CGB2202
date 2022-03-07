package day06.tast06;

import java.util.Arrays;
import java.util.Scanner;

public class Generater {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Please enter a auto_generate array's length:");
        int len=in.nextInt();
        int[] arr=generate(len);
        System.out.println(Arrays.toString(arr));
    }

    static int[] generate(int num){
        int[] arr=new int[num];
        for (int i = 0; i < arr.length; i++) {
            int temp=(int)(100*Math.random());
            arr[i]=temp;
        }
        return arr;

    }

}
