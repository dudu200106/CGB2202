package day05.task05;

public class EvenSum {
    public static void main(String[] args) {
        int res=0;
        for (int i = 0; i <= 100; i++) {
            if ((i&1)==0)
                res+=i;
        }
        System.out.println("result: "+ res);
    }
}
