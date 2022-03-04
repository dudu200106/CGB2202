package day05.task05;

public class ArrayDefine {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        char[] ch=new char[4];
        for (int i = 0; i < arr.length; i++) {
            ch[i]=(char)(arr[i]+'0');
        }

        for (char c: ch) {
            System.out.print(c + " ");
        }
    }
}
