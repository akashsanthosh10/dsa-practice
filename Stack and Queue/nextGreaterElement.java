import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        HashMap<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for (int i = nums2.length - 1; i >= 0; i--) 
        {
            while (!st.isEmpty() && st.peek() <= nums2[i]) 
            {
                st.pop();
            }

            if (st.isEmpty())
                mp.put(nums2[i], -1);
            else
                mp.put(nums2[i], st.peek());

            st.push(nums2[i]);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = mp.get(nums1[i]);
        }

        System.out.print("Result: ");
        for (int x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();


    }
}
