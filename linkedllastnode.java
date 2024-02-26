//append last n node at the beginnning of the list
public class linkedllastnode {
    Node head,tail;

    linkedllastnode(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void create(int data){
        Node newnode = new Node(data);
        if(head==null)
           tail = head = newnode;
        else{
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void print(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(head!=null){
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void lasttobeg(int pos){
        Node temp = head;
        for(int i=1;i<pos;i++)
            temp = temp.next;
        tail.next = head;
        head  =temp.next;
        temp.next = null;
    }
    public static void main(String args[]){
        linkedllastnode l = new linkedllastnode();
        l.create(10);
        l.create(20);
        l.create(30);
        l.create(40);
        l.create(50);
        l.create(60);
        l.print(l.head);
        System.out.println();
        l.lasttobeg(3);
        l.print(l.head);
    }
}
