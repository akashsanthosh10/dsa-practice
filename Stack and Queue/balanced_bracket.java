import java.util.Scanner;
import java.util.Stack;

public class balanced_bracket {
        public static void main(String[] args) {
        Stack  <Character> s=new Stack<Character>();
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        for(int i=0;i<exp.length();i++)
        {
            System.out.println(exp.charAt(i)+"  "+s);
            if(exp.charAt(i)=='(' ||exp.charAt(i)=='{' ||exp.charAt(i)=='[')
            {
               
                s.push(exp.charAt(i));
            }
            else if(exp.charAt(i)==')')
            {
                if(s.size()==0)
                {System.out.println(false);return;}
                else if(s.peek()=='(')
                s.pop();
                else{System.out.println(false);return;}
                
            }
            else if(exp.charAt(i)==']')
            {
                if(s.size()==0)
                {System.out.println(false);return;}
                else if(s.peek()=='[')
                s.pop();
                else{System.out.println(false);return;}
                
            }
            else if(exp.charAt(i)=='}')
            {
                if(s.size()==0)
                {System.out.println(false);return;}
                else if(s.peek()=='{')
                s.pop();
                else{System.out.println(false);return;}
                
            }
        }
        System.out.println(true);

    }
    
}
