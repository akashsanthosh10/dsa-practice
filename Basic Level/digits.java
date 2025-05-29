import java.util.Scanner;

public class digits {

    public static int inverse(int n)
    {
        int temp=n,nod=0;
        while(temp>0)
        {
            temp=temp/10;
            nod++;
        }
        temp=n;
        int div=(int)Math.pow(10,nod-1);
        int sum=0;
        while(temp>0)
        {
            int q=temp/div;
            //System.out.println(q);
            int b=(int)Math.pow(10,q-1);
            sum+=nod*b;
            //System.out.println(q+" "+b+" "+sum+" "+nod);
            temp=temp%div;
            div=div/10;
            nod--;
        }
        return sum;
    }
    public static int rotate(int n,int k)
    {
        int temp=n,nod=0;
        while(temp>0)
        {
            temp=temp/10;
            nod++;
        }
        if(k<0)
        k=nod+k;
        //System.out.println(k+" "+nod);
        int div=(int)Math.pow(10,k);
        System.out.println(div);
        int q=n/div;
        int r=n%div;
        int sum=0;
        //int temp1=(r*(int)Math.pow(10,nod-k));
        sum=q+(r*(int)Math.pow(10,nod-k));
        //System.out.println(div+" "+q+" "+r+" "+sum+"  "+temp1);
        return sum;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Enter the times: ");
        int k=sc.nextInt();
        int temp=n,nod=0;
        while(temp>0)
        {
            temp=temp/10;
            nod++;
        }
        //System.out.println(inverse(n));
        System.out.println(rotate(n,k));

        
    }
}
