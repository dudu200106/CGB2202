package day06.tast06;

import java.util.Arrays;

public class ArrSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int temp=(int)(Math.random()*100);
            arr[i]=temp;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        StringBuilder sb=new StringBuilder(Arrays.toString(arr));
        System.out.println(sb.reverse());
    }
}
