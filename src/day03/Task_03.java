package day03;

public class Task_03 {
    public static void main(String[] args) {
        //1.
        System.out.println(6%1);
        System.out.println(3%2);
        System.out.println(5%8);

        int a=6,b=12;
        a++;
        System.out.println(a);
        b--;
        System.out.println(a);

        System.out.println(--b);
        System.out.println(++a);

        //2.
        System.out.println(a>b);
        System.out.println(!(a>b));

        System.out.println(a==b);
        System.out.println(a%b!=0);

        //3.短路运算符: &&,||
        System.out.println(a>0&&b>0);
        System.out.println(a>0&&b<0);
        System.out.println(a>0||b<0);
        System.out.println(a>0||b>0);

        a=1;
        b=10;
        int c=100;
        System.out.println(a!=1 && b++ >0);
        System.out.println(b);
        System.out.println(a==1 && b++ >0);
        System.out.println(b);

        System.out.println(a!=b || c++ >0);
        System.out.println(b);
        System.out.println(a==b || c++ >0);
        System.out.println(b);

        //4.
        a=10;
        a+=10;
        System.out.println(a);
        a-=10;
        System.out.println(a);
        a*=10;
        System.out.println(a);
        a/=100;
        System.out.println(a);

        short d=10000;
        d+=10;
        System.out.println(d);

        //5.
        String name="莱昂纳多";
        int ags=50;
        System.out.println("My name is " +name+ ", and I am " +ags+ "years old");

        //6.
        int num=10;
        int flag=num==10?1:0;

        System.out.println(num>=flag?num:flag);

        //7.
        num=8;
        if((num&1)!=1){ //! &运算符优先级太低,不要忘记打括号
            System.out.println("偶数");
        }
        int price=250;
        if (price>500)
            price*=0.8;
        System.out.println("Your final amount is: " +price);

        //8.
        if ((num&0)==0)
            System.out.println("偶数");
        else
            System.out.println("奇数");

        if (price>500)
            price*=0.8;
        else
            price*=0.9;
        System.out.println("Your final amount is: " +price);
    }
}
