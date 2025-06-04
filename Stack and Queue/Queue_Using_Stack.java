import java.util.Stack;

public class Queue_Using_Stack {
    Stack<Integer> s1=new Stack<>();
    Stack<Integer> s2=new Stack<>();

    void display()
    {
        System.out.println("Queue: "+s1+" "+s2);
    }
    void enqueue(int x)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    void dequeue()
    {
        if(s1.isEmpty())
        return;
        s1.pop();
    }
    public static void main(String[] args) {
        Queue_Using_Stack q=new Queue_Using_Stack();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}
