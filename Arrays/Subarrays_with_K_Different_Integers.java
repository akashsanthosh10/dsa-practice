import java.util.HashMap;
import java.util.HashSet;

public class Subarrays_with_K_Different_Integers {


    public static int lessthan_k(int[] nums,int k)
    {
        int n=nums.length;
        int count=0,l=0,r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<n)
        {
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k)
            {
                map.put(nums[l],map.getOrDefault(nums[l],0)-1);
                if(map.get(nums[l])==0)
                map.remove(nums[l]);
                l++;
            }
            if(map.size()<=k)
            {
                count+=(r-l+1);

            }
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={1,2,1,3,4};
        int k=3;
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                set.add(nums[j]);
                if(set.size()==k)
                {
                    count++;
                }
                if(set.size()>k)
                {
                    break;
                }
            }
        }
        System.out.println("Brute force"+count);



        int ans=lessthan_k(nums, k)-lessthan_k(nums, k-1);
        System.out.println("Optimized"+ans);
    }
}
