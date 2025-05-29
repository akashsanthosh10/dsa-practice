import java.util.*;
class exp1{
    public  static void main(String args[])
    {
        System.out.println("Hello");
        Scanner sc=new Scanner(System.in);
        int n;
        //If only int,then use nextInt,else use nextLine with Interger.parseInt
        //n=sc.nextInt();
        //System.out.println(n);
        n=Integer.parseInt(sc.nextLine());
        String name;
        name=sc.nextLine();
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            System.out.println(name);
        }
        
    }
}