public class SinglyLinkedList
{
    private ListNode head;
    
        private static class ListNode 
        {
            private int data;
            private ListNode next;

             public ListNode(int data)
            {
               this.data=data;
               this.next=null;
            }
        }
public void display()
{
    ListNode current=head;
    while(current!=null)
    {
        System.out.print(current.data+"-->");
        current=current.next;
    }
    System.out.println("null");
}

public int length(){
{
    if(head==null)
    return 0;
}
    int count=0;
    ListNode current=head;
    while(current!=null)
    {
        current=current.next;
        count++;
    }
    System.out.println("length="+count);
    return count;
}

public void insertfirst(int value)
{
    if(head==null)
    {
     ListNode newNode=new ListNode(value);
     newNode.next=head;
     head=newNode;
    }
    //System.out.println("Newnode is :" +head);
    //return head;

}

public void insert(int position,int value)
{
    ListNode newNode=new ListNode(value);
    if(position==1)
    {
        newNode.next=head;
        head=newNode;
    }
    else
    {
        ListNode previous=head;
        int count=1;
        while(count<position-1)
        {
            previous=previous.next;
            count++;
        }
        ListNode current=previous.next;
        previous.next=newNode;
        newNode.next=current;

    }
}

public void insertlast(int value)
{
    ListNode node=new ListNode(value);
    if(head==null)
    {
        head=node;
        return;
    }
    ListNode current=head;
    while(current.next!=null)
    {
        current=current.next;
    }
    current.next=node;
    
}

public ListNode deletefirst()
{
    if(head==null)
    {
        return null;
    }
    ListNode temp=head;
    head=head.next;
    temp.next=null;
    return temp;

}

public void delete(int position)
{
    if(position==1)
    {
        head=head.next;
    }
    ListNode previous=head;
    int count=1;
    while(count<position-1)
    {
        previous=previous.next;
        count++;
    }
    ListNode current=previous.next;
    previous.next=current.next;
    current.next=null;
}

public ListNode deleteLast()
{
    if(head==null && head.next==null)
    { 
        ListNode temp=head;
        head=head.next;
        return temp;
    }
    ListNode current=head;
    ListNode previous=null;

    while(current.next!=null)
    {
        previous=current;      
        current=current.next;
       
    }
    previous.next=null;
    return current;
}
   
    


    public static void main(String args[])
    {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10);

        ListNode second=new ListNode(2);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(34);

        sll.head.next=second;
        second.next=third;
        third.next=fourth;
        sll.display();
        sll.length();
        //sll.insertfirst(10);
        sll.insert(3,23);
        sll.insertlast(55);
        sll.display();
        sll.deletefirst();
        sll.display();
        sll.delete(3);
        sll.display();
        sll.deleteLast();
        sll.display();
        

    }
}