import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Fruit_Into_Baskets {
    public static void main(String[] args) {


        //brute force
        int[]fruits={3,3,3,1,2,1,1,2,3,3,4};
        int n=fruits.length;
            int len=0,maxlen=0;
            for(int i=0;i<n;i++)
            {
                Set<Integer> st=new HashSet<>();
                for(int j=i;j<n;j++)
                {
                    st.add(fruits[j]);
                    if(st.size()>2)
                    break;
                    else
                    {
                        len=j-i+1;
                        maxlen=Math.max(maxlen,len);
                    }
                }
            }
            System.out.println("Bruteforce"+maxlen);

        //Optimized
        int r=0,l=0;
        maxlen=0;
        len=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        while(r<n)
        {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0)+1);
            
            //System.out.println(len+""+map);
            while(map.size()>2)
            {
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0)
                {
                    map.remove(fruits[l]);
                }
                l++;
            }
            if(map.size()<=2)
            {
                len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            //System.out.println(len);
            r++;
        }
        System.out.println("Optimized"+maxlen);
    }
}
