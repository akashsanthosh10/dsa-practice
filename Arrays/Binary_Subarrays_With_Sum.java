public class Binary_Subarrays_With_Sum {


    public static int sumlessthangoal(int[] nums,int goal)
    {
        if(goal<0)
        return 0;
        int sum=0,count=0,l=0,r=0;
        int n=nums.length;
        while(r<n)
        {
            sum+=nums[r];
            while(sum>goal)
            {
                sum-=nums[l];
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
        int[] nums={0,0,0,0,0};
        int goal=0;
        int n=nums.length;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=nums[j];
                if(sum==goal)
                count++;
                if(sum>goal)
                break;
            }
        }
        System.out.println("Brute Force"+count);
        int ans=sumlessthangoal(nums,goal)-sumlessthangoal(nums, goal-1);
        System.out.println("Optimum"+ans);
    }
}
