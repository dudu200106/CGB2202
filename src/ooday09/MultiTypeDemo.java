package ooday09;

public class MultiTypeDemo {

    public static void main(String[] args) {
        Aoo o=new Boo();
        Boo o1=(Boo)o; //对象类型一样
        Inter o2=(Inter) o; //实现了这个jiek
        if (o instanceof Coo){
            Coo o3=(Coo)o;
        }
        Aoo o4=new Coo();//
    }
}
