import java.util.Stack;

public class Stack_Using_Array {
    int[] st;
    int top,size;
    public Stack_Using_Array(int n)
    {
        top=-1;
        st=new int[n];
        size=n;
    }
    void display()
    {
        System.out.print("Stack: ");
        for(int i=0;i<=top;i++)
        {
            System.out.print(st[i]+" ");
        }
        System.out.println();
    }
    void push(int x)
    {
        if(top==size-1)
        {
            System.out.println("Full");
            return;
        }
        top++;
        st[top]=x;
    }
    int pop()
    {
        if(top==-1)
        {
            System.out.println("Empty");
            return -1;
        }
        int temp=st[top];
        top--;
        return temp;
    }
    int peek()
    {
        if(top==-1)
        {
            System.out.println("Empty");
            return -1;
        }
        return st[top];
    }
    public static void main(String[] args) {
        
        //Using Array
        Stack_Using_Array s=new Stack_Using_Array(5);
        System.out.println("Size : "+s.size);
        s.push(1);
        System.out.println("Peek : "+s.peek());
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.display();
        s.push(6);
        s.pop();
        s.display();
        s.pop();
        s.pop();
        s.pop();


    }
}
