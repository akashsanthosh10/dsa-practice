
public class linked_list {


    public static class Node{
        int data;
        Node next;
    }

    public static class Link_list{
        Node head;
        Node tail;
        int size;
        void display() 
        {
            Node temp = head;
            while (temp != null) 
            {
                System.out.print(temp.data + "   ");
                temp = temp.next;
            }
            System.out.println();
        }
        void addLast(int val)
        {
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if(size==0)
            { 
                head=tail=temp;
                size++;
            }
            else
            {
                tail.next=temp;
                tail=temp;
                size++;
            }
        }
        void remove_first()
        {
            if(size==0)
            System.out.println("List Empty");
            else if(size==1)
            {
                head=tail=null;
                size--;
            }
            else{
                head=head.next;
                size--;
            }
            
        }
        void remove_last()
        {
            if(size==0)
            System.out.println("List Empty");
            else if(size==1)
            {
                head=tail=null;
                size--;
            }
            else{
                Node temp=head;
                for(int i=0;i<size-2;i++)
                temp=temp.next;
                temp.next=null;
                tail=temp;
            }
            
        }
        void remove_by_index(int pos)
        {
            if(pos<0 || pos>size)
            {
                System.out.println("Invalid"); 
                
            }
            else if(pos==0)
            {
                
                remove_first();
            }
            else if(pos==size-1)
            {
                remove_last();
            }
            else
            {
                Node temp=head;
                for(int i=0;i<pos-1;i++)
                    temp=temp.next;
                temp.next=temp.next.next;
                size--;
            }
        }
        void addFirst(int val)
        {
            if(size==0)
            {
                Node temp=new Node();
                temp.data=val;
                temp.next=null;
                head=tail=temp;
                size++;
            }
            else
            {
                Node temp=new Node();
                temp.data=val;
                temp.next=head;
                head=temp;
                size++;
            }
        }
        void add_by_index(int val,int pos)
        {
            if(pos<0 || pos>size)
            {
                System.out.println("Invalid"); 
                
            }
            else if(pos==0)
            {
                
                addFirst(val);
            }
            else
            {
                Node n=new Node();
                n.data=val;
                Node temp=head;
                for(int i=0;i<pos-1;i++)
                    temp=temp.next;
                n.next=temp.next;
                temp.next=n;
                size++;
            }
        }
        int get_first()
        {
            if(size==0){
                System.out.println("List Empty");
                return -1;
            }
            
            else
            return head.data;
        }
        int get_last()
        {
            if(size==0){
                System.out.println("List Empty");
                return -1;
            }
            else
            {
                Node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                return temp.data;
            }
        }
        int get_element_by_index(int a)
        {
            if(size==0){
                System.out.println("List Empty");
                return -1;
            }
            else if(a<0 || a>size)
            {
                System.out.println("Invalid"); 
                return -1;
            }
            else
            {
                Node temp=head;
                for(int i=0;i<a-1;i++)
                {
                    temp=temp.next;
                }
                return temp.data;
            }
        }
        void reverse_list()
        {
            Node prev=null;
            Node curr=head;
            while(curr!=null)
            {
                Node temp=curr.next;
                curr.next=prev;
                prev=curr;
                curr=temp;
            }
            Node temp=head;
            head=tail;
            tail=temp;
        }
        int kth_element_from_last(int pos)
        {
            if(size==0){
                System.out.println("List Empty");
                return -1;
            }
            else if(pos<0 || pos>size)
            {
                System.out.println("Invalid"); 
                return -1;
            }
            else
            {
                Node curr=head;
                Node prev=head;
                for(int i=1;i<=pos;i++)
                {
                    curr=curr.next;
                }
                while(curr!=null)
                {
                    prev=prev.next;
                    curr=curr.next;
                }
                return prev.data;

            }
        }
        int middle_element()
        {
            if(size==0){
                System.out.println("List Empty");
                return -1;
            }
            else
            {
                Node f=head;
                Node s=head;
                while(f.next!=null)
                {
                    f=f.next.next;
                    s=s.next;
                    
                }
                return s.data;

            }
        }
        void remove_duplicate()
        {
            Node curr=head.next;
            Node prev=head;
            while(curr!=null)
            {
                if(prev.data!=curr.data)
                {
                    prev=curr;
                    curr=curr.next;
                }
                else
                {
                    curr=curr.next;
                    prev.next=curr;

                }
            }

        }
        static Link_list merge(Link_list l1,Link_list l2)
        {
            Node n1=l1.head;
            Node n2=l2.head;
            Link_list temp=new Link_list();
            while(n1!=null && n2!=null)
            {
                if(n1.data<n2.data)
                {
                    temp.addLast(n1.data);
                    n1=n1.next;
                }
                else
                {
                    temp.addLast(n2.data);
                    n2=n2.next;
                }
            }
            while(n1!=null)
            {temp.addLast(n1.data);n1=n1.next;}
            
            while(n2!=null)
            {temp.addLast(n2.data);n2=n2.next;}
            return temp;
        }
    }

    
    public static void main(String[] args) {
       Link_list l1=new Link_list();
       l1.addLast(5);
       l1.addLast(1);
       l1.addLast(4);
       l1.addLast(4);
       l1.display();
       l1.remove_first();
       l1.display();
       l1.remove_first();
       l1.display();
       l1.remove_first();
       l1.display();
       l1.remove_first();
       l1.display();
       l1.remove_first();
       l1.display();
       l1.addLast(5);
       l1.addLast(21);
       l1.addLast(43);
       l1.addLast(54);
       l1.display();
       System.out.println(l1.get_first()); 
       System.out.println(l1.get_last()); 
       System.out.println(l1.get_element_by_index(2)); 
       l1.addFirst(44);
       l1.display();
       l1.add_by_index(662,1);
       l1.display();
       l1.remove_last();
       l1.display();
       l1.remove_by_index(2);
       l1.display();
       l1.addLast(1);
       l1.addLast(33);
       l1.addLast(74);
       l1.reverse_list();
       l1.display();
       System.out.println(l1.kth_element_from_last(2)); 
       System.out.println(l1.middle_element()); 

       Link_list l2=new Link_list();
       l2.addLast(1);
       l2.addLast(21);
       l2.addLast(3);
       l2.addLast(5);
       l1.display();
       l2.display();
       Link_list merge_list=Link_list.merge(l1,l2);
       merge_list.display();

       Link_list d=new Link_list();
       d.addLast(1);
       d.addLast(1);
       d.addLast(2);
       d.addLast(2);
       d.addLast(3);
       d.addLast(4);
       d.display();
       d.remove_duplicate();
       d.display();
    }
}
