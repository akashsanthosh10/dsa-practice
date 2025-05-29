public class two_sum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int n=arr.length;
        int target=26;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
