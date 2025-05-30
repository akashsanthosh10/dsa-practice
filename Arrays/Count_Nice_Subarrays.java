public class Count_Nice_Subarrays {
    public static int sumlessthangoal(int[] nums,int goal)
    {
        if(goal<0)
        return 0;
        int sum=0,count=0,l=0,r=0;
        int n=nums.length;
        while(r<n)
        {
            sum+=nums[r]%2;
            while(sum>goal)
            {
                sum-=nums[l]%2;
                l++;
            }
            if(sum<=goal)
            {
                count+=r-l+1;
            }
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={2,4,6};
        int k=1;
        int n=nums.length;
        int ans=sumlessthangoal(nums,k)-sumlessthangoal(nums, k-1);
        System.out.println("Optimum"+ans);
    }
}
