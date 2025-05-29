import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_on_the_Right {


    public static void display(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack  <Integer> st=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        //Stack has element pos      
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(st.size()>0 && arr[i]>arr[st.peek()])
            {
                int pos=st.peek();
                ans[pos]=arr[i];
                st.pop();
            }
            st.push(i);

           
        }
        while(st.size()>0)
        {
            ans[st.peek()]=-1;
            st.pop();
        }
        display(arr,n);
        display(ans,n);
        //System.out.println(arr+"  "+ans);
    }
}
