import java.util.*;
public class inverse_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int len=0;
        int i=1;
        int res=0;
        while(temp>0)
        {
            int r=temp%10;
            int div=(int)Math.pow(10,r-1);
            res+=i*div;
            i++;
            temp=temp/10;

            
        }
        System.out.println(res);
    }
    
}
