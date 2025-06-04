import java.util.Scanner;
import java.util.Stack;

public class Prefix_To_Postfix {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        Stack <String> st=new Stack<>();
        char[] s=exp.toCharArray();
        for(int i=s.length-1;i>=0;i--)
        {
            //System.out.println(st+" "+s[i]);
            if((s[i]>='A'&&s[i]<='Z') || (s[i]>='a'&&s[i]<='z') || (s[i]>='0'&&s[i]<='9'))
            {
                st.push(String.valueOf(s[i]));
            }
            else
            {
                String op1=st.pop();
                String op2=st.pop();
                String temp=op1+op2+String.valueOf(s[i]);
                st.push(temp);
            }
            
        }
        System.out.println("Prefix "+st.pop());
    }
}
