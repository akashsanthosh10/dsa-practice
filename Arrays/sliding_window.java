public class sliding_window {
    public static void main(String[] args) {
        int[] arr={-1,2,3,3,4,5,-1};
        int n=arr.length;
        int k=4;
        int sum=0;
        int max_val=0;
        for(int i=0;i<k;i++)
        {
            max_val+=arr[i];
        }
        sum=max_val;
        System.out.println(max_val);
        for(int j=k;j<n;j++)
        {
            sum-=arr[j-k];
            sum+=arr[j];
            max_val=Math.max(max_val, sum);
            System.out.println(sum);
        }
        System.out.println(max_val);
    }
}
