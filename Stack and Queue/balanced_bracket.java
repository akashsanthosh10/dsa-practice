import java.util.Scanner;
import java.util.Stack;

public class balanced_bracket {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        Stack <Character> st=new Stack<Character>();
        char[] s1=exp.toCharArray();
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]=='(' ||s1[i]=='{' ||s1[i]=='[')
            {
               
                st.push(s1[i]);
            }
            else
            {
                if(st.size()==0)
                {
                    System.out.println(false);
                    return;
                }
                    
                char ch=st.peek();
                if(s1[i]==')' && ch=='(' || s1[i]==']' && ch=='[' || s1[i]=='}' && ch=='{')
                {
                    st.pop();
                }
                else
                {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(st.isEmpty());

    }
    
}
