public class Binary_Subarrays_With_Sum {
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
        System.out.println(count);

    }
}
