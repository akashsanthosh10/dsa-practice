import java.util.HashMap;


public class Longest_substring {
    public static void main(String[] args) {
        String s="cadbzabcd";
        char[] st=s.toCharArray();
        int n=st.length;
        int maxlen=0;
        //Bruteforce
        for(int i=0;i<n;i++)
        {
            String sub="";
            int len=0;
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i;j<n;j++)
            {
                if(map.containsKey(st[j]))
                {
                    break;
                }
                
                map.put(st[j],1);
                sub+=st[j];
                len=j-i+1;
                maxlen=Math.max(maxlen,len);
                System.out.print(sub+" ");
            }
            System.out.println();
        }
        System.out.println(maxlen);
        //Optimized Sliding window
        int len=0;
        maxlen=0;
        int l=0,r=0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r<n)
        {
            if(map.containsKey(st[r]))
            {
                if(map.get(st[r])>=l)
                {
                    l=map.get(st[r])+1;
                }
            }
            len=r-l+1;
            System.out.println(len);
            maxlen=Math.max(maxlen,len);
            map.put(st[r],r);
            r++;
        }
        System.out.println(maxlen);
    }
}
