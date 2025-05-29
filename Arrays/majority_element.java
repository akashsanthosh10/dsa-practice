import java.util.*;
public class majority_element {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,1};
        int n=arr.length;
        //Brute force
        for(int a:arr)
        {
            int freq=0;
            for(int b:arr)
            {
                if(a==b)
                freq++;
            }
            if(freq>n/2)
            {System.out.println(a);break;}

        }
        //Optimized Brute force
        int freq2=1,ans=arr[0];
        Arrays.sort(arr);

        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                freq2++;
            }
            else
            {
                freq2=1;
                ans=arr[i];
            }
            if(freq2>n/2)
            {
                {System.out.println(ans);break;}
            }
        }
        //Moores Algorithm
        int freq=0;
        ans=0;
        for(int i=0;i<n;i++)
        {
            if(freq==0)
            ans=arr[i];
            if(arr[i]==ans)
            freq++;
            else
            freq--;
        }
        System.out.println(ans);
    }
}
