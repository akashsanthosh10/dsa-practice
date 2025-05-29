import java.util.HashMap;
import java.util.Map;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        String s="AABABBA";
        char[] st=s.toCharArray();
        int n=st.length;
        int k=2;
        int maxFreq=0;
        int maxlen=0;
        int len=0;
        for(int i=0;i<n;i++)
        {
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<n;j++)
            {
                map.put(st[j],map.getOrDefault(st[j],0)+1);
                maxFreq=Math.max(maxFreq, map.get(st[j]));
                int change=(j-i+1)-maxFreq;
                if(change>k)
                break;
                else
                {
                    len=j-i+1;
                    maxlen=Math.max(len,maxlen);
                }
            }
            
        }
        System.out.println("Bruteforce"+maxlen);


        maxFreq=0;
        maxlen=0;
        len=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,r=0;
        int change=0;
        while(r<n)
        {
            map.put(st[r],map.getOrDefault(st[r],0)+1);
            maxFreq=Math.max(maxFreq, map.get(st[r]));
            change=(r-l+1)-maxFreq;
            System.out.println(map+" "+change+" "+maxFreq);
            if(change>k)
            {
                
                map.put(st[l],map.getOrDefault(st[l],0)-1);
                if(map.get(st[l])==0)
                map.remove(st[l]);
                // maxFreq=0;
                // for (Map.Entry<Character,Integer> entry : map.entrySet()) 
                // {
                //     int value = entry.getValue();
                //     System.out.print(value+" ");
                //     maxFreq=Math.max(maxFreq, value);
                // }
                change=(r-l+1)-maxFreq;
                l++;
                System.out.println(map+" "+change+" "+maxFreq);
            }
            if(change<=k)
            {
                len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            r++;
        }
        System.out.println("Optimized"+maxlen);
    }
}
