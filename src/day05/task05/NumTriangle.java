package day05.task05;

public class NumTriangle {
    public static void main(String[] args) {
        int cnt=1;
        int num=8;
        for (int i = 0; i < 9; i++) {
            int j=0;
            while (j<num) {
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<cnt) {
                System.out.print("*");
                j++;
            }
            num--;
            cnt+=2;
            System.out.println();
        }
    }
}
