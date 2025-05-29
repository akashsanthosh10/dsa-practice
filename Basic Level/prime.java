import java.util.*;
public class prime {
    static int prime_check(int n)
    {
        int f=1;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  numbeer");
        int n=sc.nextInt();
        if(prime_check(n)==1)
        {
            System.out.println("Prime");

        }
        else
        {
            System.out.println("Not Prime");
        }
        for(int i=1;i<100;i++)
        {
            if(prime_check(i)==1)
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
