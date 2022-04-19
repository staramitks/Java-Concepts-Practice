package home.amit.java.algorithm.lists;

public class LinkedListImpl {


    public int getSize(Node node)
    {
        int count=0;
        while(node.next!=null)
        {
            System.out.println("Increasing count=1 for data "+node.data);
            count+=1;
            node=node.next;
        }
        return count;
    }


    public void print(Node node)
    {
        int count=0;
        while(node.next!=null)
        {
            System.out.print(" "+node.data);

            node=node.next;
        }

    }

    public boolean containsNode(Node head, int data)
    {
        boolean result=false;
        while (head.next!=null)
        {
            if (head.data==data)
            {
                result= true;
            }
            head=head.next;

        }
        return result;

    }

    public void addToHead(Node head, int data)
    {
        Node newHead=new Node(data);
        newHead.next=head;
        System.out.println(getSize(newHead));

    }

    public Node addToIndex(Node head, Node newNode, int index)
    {
        int i=0;
        Node originalHead=head;
        Node n=null;
        Node nextNodes;
        Node currentNode=head;
        if (index==0)
        {
            newNode.next=head;
            return newNode;

        }
        while (head.next!=null && i<=index)
        {
            if (i==index-1)
            {
                nextNodes=currentNode.next;
                currentNode.next=newNode;
                newNode.next=nextNodes;
                break;
            }
            currentNode=head.next;
            head=currentNode;
            ++i;

        }
        return originalHead;

    }

    public Node removeNode(Node head, Node deleteNode)
    {
        Node prevNode;
        Node currentNode=head;
        if (deleteNode.data== currentNode.data)
        {
            currentNode=head.next;
            return currentNode;
        }

        prevNode=head;
        currentNode=head.next;
        while (deleteNode.data != currentNode.data)
        {
            prevNode=prevNode.next;
            currentNode=currentNode.next;
        }
        prevNode.next=currentNode.next;
        return head;


    }



    public static void main(String[] args) {
        Node head= new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);

        LinkedListImpl list= new LinkedListImpl();
        System.out.println(list.getSize(head));

        list.addToHead(head,1);

        System.out.println(list.containsNode(head,300));

        list.print(head);
        Node newNode=list.addToIndex(head,new Node(25),2);
        System.out.println("");
        System.out.println("============  Result ===========");

        list.print(newNode);


        Node updatedNode=list.removeNode(head,new Node(25));
        System.out.println("");
        System.out.println("============  Result ===========");

        list.print(updatedNode);




    }
}
