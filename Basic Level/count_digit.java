import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=0;
        int temp=n;
        while(temp>0)
        {
            int r=temp%10;
            System.out.print(" "+r);
            len++;
            temp=temp/10;
        }
        System.out.println("\nLength:"+len);
    }
}
