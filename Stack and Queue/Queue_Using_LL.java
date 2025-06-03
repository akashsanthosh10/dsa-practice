class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Queue_Using_LL {
    Node front,rear;
    public Queue_Using_LL()
    {
        front=null;
        rear=null;
    }
    void enqueue(int x)
    {
        Node temp=new Node(x);
        if(front==null)
        {
            front = rear = temp; 
        }
        else
        {
            rear.next=temp;
            rear=temp;
        }
    }
    int dequeue()
    {
        if(front==null)
        {
            System.out.println("Empty");
            return -1;
        }
        int result = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        return result;
    }
    void display()
    {
        if(front==null)
        {
            System.out.println("Empty");
            return;
        }
        Node temp=front;
        System.out.print("Queue:");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.err.println();
    }

    public static void main(String[] args) {
        Queue_Using_LL q=new Queue_Using_LL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
