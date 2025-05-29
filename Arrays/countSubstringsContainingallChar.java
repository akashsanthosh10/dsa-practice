import java.util.HashSet;

public class countSubstringsContainingallChar {
    public static void main(String[] args) {
        String s="bbacba";
        char[] st=s.toCharArray();
        int n=st.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Character> sp=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                sp.add(st[j]);
                if(sp.size()==3)
                {
                    count+=(n-j);
                    break;
                }
                
                
            }
        }
        System.out.println("Bruteforce"+count);

        //Optimized
        int[] lastscene={-1,-1,-1};
        count=0;
        for(int i=0;i<n;i++)
        {
            lastscene[st[i]-'a']=i;
            if(lastscene[0]!=-1 && lastscene[1]!=-1 && lastscene[2]!=-1)
            count+=1+Math.min(lastscene[0], Math.min(lastscene[1], lastscene[2]));
        }
        System.out.println("Optimized"+count);
    }
}
