package day05;
//数组的演示
public class ArrayDemo {
    public static void main(String[] args) {
        //4)数组的遍历:从头到尾挨个走一遍
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){ //遍历arr数组
            //arr[i]代表arr中的每个元素
            arr[i] = (int)(Math.random()*100); //给每个元素赋值为0到99的随机数
            System.out.println(arr[i]); //输出每个元素的值
        }

        //在day06包中创建MaxOfArray的类，将数组的遍历代码重写一次----下次课用


















        /*
        //3)数组的访问:访问的是数组中的元素
        int[] arr = new int[3];
        System.out.println(arr[0]); //输出第1个元素
        arr[0] = 100; //给第1个元素赋值为100
        arr[1] = 200; //给第2个元素赋值为200
        arr[2] = 300; //给第3个元素赋值为300
        //arr[3] = 400; //运行时会发生ArrayIndexOutOfBoundsException数组下标越界异常
        System.out.println(arr.length); //输出arr的长度
        System.out.println(arr[arr.length-1]); //输出最后一个元素的值
        */













        /*
        //1)数组的定义:
        //声明整型数组arr，包含10个元素，每个元素都是int类型，默认值为0
        int[] arr = new int[10];

        //2)数组的初始化:初始化的是数组中的元素
        int[] arr1 = new int[3]; //0,0,0
        int[] arr2 = {2,5,8}; //2,5,8
        int[] arr3 = new int[]{2,5,8}; //2,5,8
        int[] arr4;
        //arr4 = {2,5,8}; //编译错误，此方式只能声明同时初始化
        arr4 = new int[]{2,5,8}; //正确
        */

    }
}






















