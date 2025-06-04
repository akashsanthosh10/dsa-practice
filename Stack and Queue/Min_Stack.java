import java.util.Stack;

public class Min_Stack {
    Stack<int[]> st;
    public Min_Stack()
    {
       st=new Stack<>();
    }
    void display()
    {
        System.out.println("Stack: "+st);
    }
    void push(int x)
    {
        
        if(st.isEmpty())
        {
            st.push(new int[]{x, x});
            System.out.println("Pushed:"+st.peek()[0]);
            return;
        }
        
        int min=Math.min(x,st.peek()[1]);
        st.push(new int[]{x, min});
        System.out.println("Pushed:"+st.peek()[0]);
    }
    void pop()
    {
        if(st.isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        System.out.println("Popped:"+st.peek()[0]);
        st.pop();
    }
    void get_Min()
    {
        if(st.isEmpty())
        {
            System.out.println("Empty");
            return;
        }
        System.out.println("Min:"+st.peek()[1]);
    }
    public static void main(String[] args) {
        Min_Stack m=new Min_Stack();
        m.push(10);
        m.get_Min();
        m.push(20);
        m.get_Min();
        m.push(30);
        m.push(5);
        m.get_Min();
        m.pop();
        m.get_Min();
        m.pop();
        m.get_Min();

        m.pop();
        m.get_Min();

    }
}
