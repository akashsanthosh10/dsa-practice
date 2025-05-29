import java.util.*;
public class rotate_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int temp=n;
        int nod=0;
        int res=0;
        while(temp>0)
        {
            temp=temp/10;
            nod++;
            
        }
        if(k<0)
        k=nod+k;
        int div=(int)Math.pow(10,k);
        int q=n/div;
        int r=n%div;
        res=q+(r*(int)Math.pow(10,nod-k));
        System.out.println(res);
    }
    
}
