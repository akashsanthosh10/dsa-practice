class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Stack_Using_LL {
    Node top;
    public Stack_Using_LL()
    {
        top=null;
    }

    void display()
    {
        if(top==null)
        {
            System.out.println("Empty");
        }
        Node temp=top;
        System.out.print("Stack:");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void push(int x)
    {
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
    }
    int pop()
    {
        if(top==null)
        {
            System.out.println("Empty");
            return -1;
        }
        int temp=top.data;
        top=top.next;
        return temp;
    }
    int peek()
    {
        if(top==null)
        {
            System.out.println("Empty");
            return -1;
        }
        return top.data;
    }
    public static void main(String[] args) {
        Stack_Using_LL st=new Stack_Using_LL();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println("Peek"+st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
