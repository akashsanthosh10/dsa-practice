import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Infix_To_Prefix {
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
        StringBuilder sb = new StringBuilder(exp);
        sb.reverse();
        Stack <Character> st=new Stack<Character>();
        String infix = sb.toString();
        char[] s=infix.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length;i++)
        {
            System.out.println(st+" "+s[i]);
            if((s[i]>='A'&&s[i]<='Z') || (s[i]>='a'&&s[i]<='z') || (s[i]>='0'&&s[i]<='9'))
            {
                ans.append(s[i]);
            }
            else if(s[i]==')')
            {
                st.push(s[i]);
            }
            else if(s[i]=='(')
            {
                while(!st.isEmpty() && st.peek()!=')')
                {
                    ans.append(st.pop());
                }
                st.pop();
            }
            else
            {
                while(!st.isEmpty() && precedence(s[i])<=precedence(st.peek()))
                {
                    ans.append(st.pop());
                }
                st.push(s[i]);
            }
        }
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }

        System.out.println("Postfix "+String.valueOf(ans.reverse()));
    }
}
