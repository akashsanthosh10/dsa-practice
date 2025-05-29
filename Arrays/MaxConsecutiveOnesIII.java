

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k=2;int n=nums.length;
        int maxlen=0;
        //Bruteforce
        for(int i=0;i<n;i++)
        {
            int len=0;
            int zeros=0;
            for(int j=i;j<n;j++)
            {
                if(nums[j]==0)
                zeros++;
                if(zeros>k)break;
                else{
                    len=j-i+1;
                    maxlen=Math.max(maxlen,len);
                }
                
                System.out.print(nums[j]+" ");
            }
            System.out.println();
        }
        System.out.println(maxlen+"Bruteforce");

        //Window Approach

        int l=0,r=0;
        int zeros=0;
        maxlen=0;
        int len=0;
        while(r<n)
        {
            if(nums[r]==0)
            zeros++;
            while(zeros>k)
            {
                if(nums[l]==0)
                zeros--;
                l++;
            }
            if(zeros<=k)
            {
                len=r-l+1;
                
                maxlen=Math.max(maxlen,len);
            }
            System.out.println(len);
            r++;
        }
        System.out.println(maxlen);

    }
}
