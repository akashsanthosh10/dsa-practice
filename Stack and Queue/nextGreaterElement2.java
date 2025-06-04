import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement2 {
    public static void main(String[] args) {
        int[] nums = {2,10,12,1,11};
        int n=nums.length;
        int[] nge=new int[n];

        //Bruteforce
        for (int i = 0; i<n; i++) 
        {
            nge[i]=-1;
            for(int j=i+1;j<i+n;j++)
            {
                int ind=j%n;
                if(nums[ind]>nums[i])
                {
                    nge[i]=nums[ind];
                    break;
                }
            }
        }
        System.out.print("Result: ");
        for (int x : nge) {
            System.out.print(x + " ");
        }
        System.out.println();
        //Optimized
        Stack  <Integer> st1=new Stack<Integer>();
        int[] ans2=new int[n];
        for(int i=2*n-1;i>=0;i--)
        {
            //System.out.println(st1);
            while(!st1.isEmpty() && st1.peek()<=nums[i%n])
            {
                st1.pop();
            }
            if(i<n)
            {
                ans2[i]=(st1.isEmpty())?-1:st1.peek();
            }
            st1.push(nums[i%n]);
        }
        System.out.print("Result: ");
        for (int x : ans2) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
