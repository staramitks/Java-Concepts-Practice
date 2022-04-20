package home.amit.java.algorithm.gfg.linkedlist.circularLinkedList;

public class TraversalCircularLinkedList {
    static class Node
    {
        int data;
        Node next;
    };

    /* Function to insert a node at the beginning of a Circular linked list */
    static Node push(Node head_ref,int data)
    {
        Node newNode= new Node();
        newNode.data=data;
        Node currentNode=head_ref;
        Node prevNode=null;

        if (head_ref == null)
        {
            newNode.next=newNode;
            return newNode;
        }
        // check for single node circular list
        if (currentNode.next!=null && currentNode.next.data==head_ref.data)
        {
            currentNode.next=newNode;
            newNode.next=head_ref;
            head_ref=newNode;

            return head_ref;

        }
        currentNode=currentNode.next;
        while(currentNode.data!= head_ref.data)
        {
            prevNode=currentNode;
            currentNode=currentNode.next;

        }
        prevNode.next=newNode;
        newNode.next=head_ref;
        head_ref=newNode;
        return head_ref;

    }


    public void traverseList(Node node)
    {
        Node traversal=node;
        if(node == null || node.next.data==node.data)
        {
            return;
        }

        System.out.println(traversal.data);
        traversal=traversal.next;

        while (traversal.data != node.data)
        {
            System.out.println(traversal.data);
            traversal=traversal.next;


        }
        System.out.println("Traversal done");

    }



    public static void main(String[] args) {

        Node node=new Node();
        node.data=10;
        node.next=node;
        TraversalCircularLinkedList traversalCircularLinkedList= new TraversalCircularLinkedList();
        TraversalCircularLinkedList.push(node, 20);
        TraversalCircularLinkedList.push(node, 30);
        TraversalCircularLinkedList.push(node, 40);
        TraversalCircularLinkedList.push(node, 50);
        TraversalCircularLinkedList.push(node, 60);
        traversalCircularLinkedList.traverseList(node);

    }
}
