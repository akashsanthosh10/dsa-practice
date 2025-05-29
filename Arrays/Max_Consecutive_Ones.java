

public class Max_Consecutive_Ones {
        public static void main(String[] args) {
            int[] nums = {1,1,0,1,1,1,1};
            int count=0,maxcount=0;
            int n=nums.length;
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                count=0;
                else
                count++;
                maxcount=Math.max(maxcount,count);
            
            }
            System.out.println(maxcount);
        }
}
