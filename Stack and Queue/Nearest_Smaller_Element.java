import java.util.Stack;

public class Nearest_Smaller_Element {
    public static void main(String[] args) {
        int[] nums = {4,5,2,10,8};
        int n=nums.length;
        int[] nge=new int[n];

        //Bruteforce
        for (int i = 0; i<n; i++) 
        {
            nge[i]=-1;
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]<nums[i])
                {
                    nge[i]=nums[j];
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
        Stack  <Integer> st=new Stack<Integer>();
        int[] ans2=new int[n];
        for(int i=0;i<n;i++)
        {
            //System.out.println(st1);
            while(!st.isEmpty() && st.peek()>nums[i])
            {
                st.pop();
            }
            ans2[i]=(st.isEmpty())?-1:st.peek();
            st.push(nums[i]);
        }
        System.out.print("Result: ");
        for (int x : ans2) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
