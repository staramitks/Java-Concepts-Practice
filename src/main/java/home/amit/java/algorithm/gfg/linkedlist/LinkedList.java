package home.amit.java.algorithm.gfg.linkedlist;

public class LinkedList {
    public Node head;
    public LinkedList(Node node){
        this.head=node;
    }


    public Node push(int data)
    {
        Node node= new Node(data);
        node.next=head;
        head=node;
        return head;
    }
    public Node pushAfter(int data, int matchData)
    {
        Node node= new Node(data);
        Node prevNode=null;
        Node currentNode=head;
        while (currentNode.data!=matchData)
        {
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
        Node nextNode=currentNode.next;
        currentNode.next=node;
        node.next=nextNode;
        return head;
    }

    public Node deleteKey(int data)
    {
        Node node= new Node(data);
        Node prevNode=null;
        Node currentNode=head;
        if (currentNode.data==data)
        {
            head=head.next;
        }
        else {
            while (currentNode.data != data) {
                prevNode = currentNode;
                currentNode = currentNode.next;
            }
            if (currentNode.data == data)
            {
                prevNode.next=currentNode.next;
            }

        }
        return head;
    }


    public static void main(String[] args) {
        Node node=new Node(10);
        node.next=new Node(20);
        node.next.next=new Node(30);
        LinkedList list= new LinkedList(node);
//        while (list.head!=null)
//        {
//            System.out.println(list.head.data);
//            Node newnode=list.head;
//            list.head=newnode.next;
//        }

        list.push(40);
        Node currentNode=list.head;
        while (currentNode!=null)
        {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;

        }

        list.pushAfter(25,20);
         currentNode=list.head;
        while (currentNode!=null)
        {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;

        }

        list.deleteKey(25);
        currentNode=list.head;
        while (currentNode!=null)
        {
            System.out.println(currentNode.data);
            currentNode=currentNode.next;

        }

    }
}
