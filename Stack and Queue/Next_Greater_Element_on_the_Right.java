import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_on_the_Right {


    public static void display(int[] a,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        
        int[] arr={6,0,8,1,3};
        int n=arr.length;
        display(arr,n);
        //Bruteforce
        int[] nge=new int[n];
        for(int i=0;i<n;i++)
        {
            nge[i]=-1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {

                    nge[i]=arr[j];
                    break;
                    
                }
            }
        }
        display(nge,n);

        //Optimize from right to left
        Stack  <Integer> st1=new Stack<Integer>();
        int[] ans2=new int[n];
        // ans2[n-1]=-1;
        // st1.push(arr[n-1]);
        for(int i=n-1;i>=0;i--)
        {
            //System.out.println(st1);
            while(!st1.isEmpty() && st1.peek()<=arr[i])
            {
                st1.pop();
            }
            if(st1.isEmpty())
            ans2[i]=-1;
            else
            ans2[i]=st1.peek();
            st1.push(arr[i]);
        }
        display(ans2,n); 







         //Optimize from left to right
        Stack  <Integer> st=new Stack<Integer>();
        

        
        int[] ans=new int[n];
       

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
        
        display(ans,n);
        //System.out.println(arr+"  "+ans);
    }
}
