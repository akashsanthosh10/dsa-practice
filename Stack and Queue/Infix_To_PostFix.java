import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Infix_To_PostFix {

    public static int precedence(char c)
    {
        if(c=='^')
        return 3;
        else if(c=='*' || c=='/')
        return 2;
        else if(c=='+' || c=='-')
        return 1;
        else
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        Stack <Character> st=new Stack<Character>();
        char[] s=exp.toCharArray();
        ArrayList<Character> ans=new ArrayList<>();
        for(int i=0;i<s.length;i++)
        {
            System.out.println(st+" "+s[i]);
            if((s[i]>='A'&&s[i]<='Z') || (s[i]>='a'&&s[i]<='z') || (s[i]>='0'&&s[i]<='9'))
            {
                ans.add(s[i]);
            }
            else if(s[i]=='(')
            {
                st.push(s[i]);
            }
            else if(s[i]==')')
            {
                while(!st.isEmpty() && st.peek()!='(')
                {
                    ans.add(st.pop());
                }
                st.pop();
            }
            else
            {
                while(!st.isEmpty() && precedence(s[i])<=precedence(st.peek()))
                {
                    ans.add(st.pop());
                }
                st.push(s[i]);
            }
        }
        while(!st.isEmpty())
        {
            ans.add(st.pop());
        }

        System.out.println("Postfix "+String.valueOf(ans));
    }
}
