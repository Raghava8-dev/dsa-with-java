
package LinkedList;
import java.util.LinkedList;
class Node{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
}
public class searchinLL {
    public static void main(String args[])
    {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        System.out.println(search(head, 50));

    }
    public static int search(Node head,int x)
    {
       int pos=1;
       Node curr=head;
       while(curr!=null)
       {
        if(curr.data==x)
        return pos;
        else
        {
            curr=curr.next;
            pos++;
        }
       }
       return -1;
    }
}
