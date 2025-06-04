import java.util.LinkedList;
import java.util.Queue;

public class Stack_Using_Queue {
    Queue<Integer> q1=new LinkedList<>();

    void display()
    {
        System.out.println("Stack: "+q1);
    }
    void push(int x)
    {
        int s=q1.size();

        q1.add(x);

        for(int i=0;i<s;i++)
        {
            q1.add(q1.remove());
        }
    }
    void pop()
    {
        if(q1.isEmpty())
        return;
        q1.remove();
    }
    public static void main(String[] args) {
        Stack_Using_Queue st=new Stack_Using_Queue();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        st.pop();
        st.display();
    }
}
