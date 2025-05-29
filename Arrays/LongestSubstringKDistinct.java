import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringKDistinct {
    public static void main(String[] args) {
        String s="aaabbccd";
        int k=2;
        char[] st=s.toCharArray();
        int n=st.length;
        int maxlen=0;
        int len=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Character> sp=new HashSet<>();

            for(int j=i;j<n;j++)
            {
                sp.add(st[j]);
                if(sp.size()>k)
                break;
                else
                {
                    len=j-i+1;
                    maxlen=Math.max(len,maxlen);
                }
            }
        }
        System.out.println("Bruteforce"+maxlen);

        maxlen=0;
        len=0;
        int l=0,r=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(r<n)
        {
            
            map.put(st[r],map.getOrDefault(st[r],0)+1);
            //System.out.println(map+" "+len);
            //System.out.println(map.size()+" "+len);
            while(map.size()>k)//if will reduce complexity
            {
                //System.out.println(map+" "+len);
                map.put(st[l],(map.get(st[l])-1));
                if(map.get(st[l])==0)
                map.remove(st[l]);
                
                l++;
            }
            if(map.size()<=k)
            {
                len=r-l+1;
                maxlen=Math.max(maxlen, len);
            }
            r++;
        }
        System.out.println("Optimized"+maxlen);
    }
}
