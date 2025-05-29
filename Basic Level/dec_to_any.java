import java.util.Scanner;

public class dec_to_any {




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the base: ");
        int b=sc.nextInt();

        int ans=0,i=0;
        while(n>0)
        {
            int r=n%b;
            n=n/b;
            ans+=r*Math.pow(10,i++);
        }
        System.out.println(ans);
    }
}
