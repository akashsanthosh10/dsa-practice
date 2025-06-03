public class Queue_Using_Array {
    int q[];
    int size;
    int front,rear;
    public Queue_Using_Array(int n)
    {
        q=new int[n];
        size=n;
        front=-1;
        rear=-1;
    }
    void enqueue(int x)
    {
        if((rear + 1) % size == front)
        {
            System.out.println("Full");
            return;
        }
        if(front==-1)
        {
            rear=0;
            front=0;
        }
        else
        {
            rear=(rear+1)%size;
        }
        q[rear]=x;
    }
    int dequeue()
    {
        if(front==-1)
            {
            System.out.println("Empty");
            return -1;
        }
        int temp=q[front];
        if(front==rear)
        {
            front=rear=-1;
        }
        else
        {
            front=(front + 1) % size;
        }
        return temp;
    }
    void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(q[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue_Using_Array q=new Queue_Using_Array(5);
       q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(50);
        q.enqueue(60);
        q.display();
        q.enqueue(70); // should print "Queue is full"
    }
}
