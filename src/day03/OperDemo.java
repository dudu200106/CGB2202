package day03;

public class OperDemo {
    public static void main(String[] args) {
        int a=1;
        System.out.println(++a);
        int b=10;

        //逻辑运算是建立在 关系运算 的基础上的, 运算结果也只能是boolean型
        System.out.println( a>b );
        //输出: false

        // ! 的运算级别最高
        //boolean m=!a>b; //出错, 相当于-- (!2)>10 : (!int)>int
        boolean m=!(a>b);
        System.out.println("The result of \"as>b\" is: " + m);
        System.out.println( );

        //短路与&&和与&, 短路或||和或| 的区别
        /*
            1."短路"效果指的是只执行一边, 就可以得到最终的结果
            2.短路与&&: 具有短路的效果,若左边是false,就不执行左边--"有false则false"
            3.短路或||: 也是一样,若左边是true,则不执行后边的逻辑运算了--"有true则true"

        */
        boolean f=a++>1;
        System.out.println(f);

        //扩展赋值运算符: +=, *=, /=

        /*+:
            1.加号两边都是数字,做加法运算;
            2,若有一边是字符或者字符串, 则做字符串拼接运算--就连System.out.println("I am " + age+ "years old") 也是字符串拼接!
         */
        int age=48;
        System.out.println("I am " + age + " years old");
        System.out.println(123456 + ""); //整型快速变成字符串方法
        System.out.println(123456 + ' ');//尾部多加了一个空格
        //任何基础数据类型的数据与String做连接,都会被同化为String--同化作用

    }
}
