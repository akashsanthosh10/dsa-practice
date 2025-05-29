import java.util.*;
public class duplicate_bracket {
    public static void main(String[] args) {
        Stack  <Character> s=new Stack<Character>();
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        for(int i=0;i<exp.length();i++)
        {
            System.out.println(exp.charAt(i)+"  "+s);
            if(exp.charAt(i)==')')
            {
                if(s.peek()=='(')
                {
                    System.out.println(true);
                    return ;
                }
                else
                {
                    while(s.peek()!='(')
                    {
                        s.pop();
                    }
                    s.pop();
                }
            }
            else
            {
                s.push(exp.charAt(i));
            }
        }
        System.out.println(false);

    }
}
