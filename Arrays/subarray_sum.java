import java.util.HashMap;

public class subarray_sum {
    public static void main(String[] args) {
        int[] arr={9,4,20,3,10,5};
        int n=arr.length;
        int tar=33;
        int count=0;
        //Bruteforce
        for(int i=0;i<n;i++)
        {
            int curr=0;
            for(int j=i;j<n;j++)
            {
                curr+=arr[j];
                if(curr==tar)
                {
                    count++;
                    System.out.println(i+" "+j);
                }
                
            }
        }
        System.out.println(count);
        //Prefix Sum
        int[] ps=new int[n];
        count=0;
        ps[0]=arr[0];
        for(int i=1;i<n;i++)
            ps[i]=ps[i-1]+arr[i];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j=0;j<n;j++)
        {
            if(ps[j]==tar)
            count++;
            int temp=ps[j]-tar;
            if(map.containsKey(temp))
            count+=map.get(temp);
            // if(!map.containsKey(ps[j]))
            // map.put(ps[j],0);
            // map.put(ps[j],map.get(ps[j])+1);
            map.put(ps[j],map.getOrDefault(ps[j], 0) + 1);
        }
        System.out.println(count);
        //Simple way is there


    }
}
