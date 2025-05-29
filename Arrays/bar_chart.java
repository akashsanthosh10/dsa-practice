public class bar_chart {
    public static void main(String[] args) {
        int[] arr={3,1,0,7,5};
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        for(int i=max;i>=1;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]>=i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
