package day02;

public class VarDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = a + 10;
        System.out.println(a);

        int g = 5;
        int h = g + 10;
        System.out.println(h);
        g += 10;
        System.out.println(g);
        int i;
//        System.out.println(i); java不允许变量未初始化使用, 编译时报错

//        int true=0; 变量命名不能使用关键字, 否则编译时报错
        int 中文; //可以用中文,但许多开源框架不是sun公司的, 对中文的, 不建议使用中文命名变量

        // java里不推荐使用short,float, short和float是因为要兼容c++才出现的, 一般用int和double
        //Java 是对c++的优化和内容简洁, 继承的同时摒弃了一些复杂的指针和多重继承等内容
        short m;
        float n;
    }
}
