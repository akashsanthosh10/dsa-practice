public class max_subarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int currsum=0;
        //Brute force
        for(int i=0;i<n;i++)
        {
            currsum=0;
            for(int j=i;j<n;j++)
            {
                currsum+=arr[j];
                maxsum=Math.max(currsum,maxsum);
                System.out.print(currsum+" ");
            }
            
            System.out.println();
        }
        System.out.println("Answer"+maxsum);
        //Kadanes Algorithm
        currsum=0;
        maxsum=0;
        for(int i=0;i<n;i++)
        {
            currsum+=arr[i];
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0)
            currsum=0;
        }
        System.out.println("Answer"+maxsum);
    }
}
