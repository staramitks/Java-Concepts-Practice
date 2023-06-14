package home.amit.java.algorithm.gfg.linkedlist.circularLinkedList;

public class TraversalCircularLinkedList {
    static class Node {
        int data;
        Node next;
    }

    /* Function to insert a node at the beginning of a Circular linked list */
    static Node push(Node head_ref, int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node currentNode = head_ref;
        Node prevNode = null;

        if (head_ref == null) {
            newNode.next = newNode;
            return newNode;
        }
        // check for single node circular list
        if (currentNode.next != null && currentNode.next.data == head_ref.data) {
            currentNode.next = newNode;
            newNode.next = head_ref;
            head_ref = newNode;

            return head_ref;

        }
        currentNode = currentNode.next;
        while (currentNode.data != head_ref.data) {
            prevNode = currentNode;
            currentNode = currentNode.next;

        }
        prevNode.next = newNode;
        newNode.next = head_ref;
        head_ref = newNode;
        return head_ref;

    }


    public void traverseList(Node node) {
        Node traversal = node;
        if (node == null || node.next.data == node.data) {
            return;
        }

        System.out.println(traversal.data);
        traversal = traversal.next;

        while (traversal.data != node.data) {
            System.out.println(traversal.data);
            traversal = traversal.next;


        }
        System.out.println("Traversal done");

    }

    public void splitCircularList(Node head) {
        // find length of list
        // Divide length by 2 and split list after n iterations.
        // for next elements join first and last element

        Node firstHead = head;

        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        current = current.next;
        int length = 1;
        while (current != head) {
            System.out.print(" " + current.data);
            current = current.next;
            length++;
        }
        System.out.println("Length is " + length);
        int mid = length / 2;

        Node first = head;
        int midCounter = 1;
        Node prevNode = null;
        while (midCounter <= mid) {
            prevNode = first;
            first = first.next; //20,30,40,50
            midCounter++;

        }
        Node secondHead = first; //50->60
        Node currentSecond = secondHead; //50->60
        prevNode.next = firstHead; // 50->10


        int secondLength = length - mid;
        Node prevPos = null;
        while (currentSecond != head) {
            prevPos = currentSecond;
            currentSecond = currentSecond.next;
        }

        prevPos.next = first;

        printNodes(firstHead);
        printNodes(secondHead);


    }

    public void printNodes(Node node) {
        Node temp = node;
        int matchCount = 0;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        }
        while (node != temp);


    }


    public static void main(String[] args) {

        Node node = new Node();
        node.data = 10;
        node.next = node;
        TraversalCircularLinkedList traversalCircularLinkedList = new TraversalCircularLinkedList();
        TraversalCircularLinkedList.push(node, 20);
        TraversalCircularLinkedList.push(node, 30);
        TraversalCircularLinkedList.push(node, 40);
        TraversalCircularLinkedList.push(node, 50);
        TraversalCircularLinkedList.push(node, 60);
        traversalCircularLinkedList.traverseList(node);
        traversalCircularLinkedList.splitCircularList(node);

    }
}
