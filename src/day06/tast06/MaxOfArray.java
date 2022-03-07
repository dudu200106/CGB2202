package day06.tast06;

import java.util.Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr= {1,2,36,45,4};
        Arrays.sort(arr);
        arr=Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=arr[arr.length-2];
        System.out.println(arr[arr.length-1]);
    }
}
