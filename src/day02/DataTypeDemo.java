package day02;

public class DataTypeDemo {
    public static void main(String[] args) {
        int a=25;
        //int b=10000000000; //初始化赋值时的错误,编译异常
        int b = (int)Math.pow(10,10); //运算时错误,溢出, 得到int类型的最大值2147483648;
        System.out.println(b);
        //长整型
        long c=1000000000000000l;
        long d=1000000000* 6l; //int * long = long

        //若是直接赋值为 c=100000000000000就会报错, 因为Java默认数值为int类型
        System.out.println(1000000000000L); //长整型的直接量, 后面直接加上'l'或者'L'

        //浮点型

        //java里浮点数默认为double型
        /*如: float e=10.0 会报错 */
        //若是还要用则需强制转换数值类型;
        float e=(float)10.0;
        //或者用float的直接量
        e=100.0F;
        System.out.println("e:" + e);

        //若是double类型的值初始化时过长(超过了8位数), 则表现为科学计数类型的值, 大小一致
        double i=1234444678.0;
        System.out.println("i: "+i); //输出: i: 1.234444678E9

        //浮点型运算可能会发生误差
        double m=6.0, n=1.9;
        System.out.println(m-n); //可能会得到1.00000000009
        //所以涉及到精确的数值类型, 不能用double

    }
}
