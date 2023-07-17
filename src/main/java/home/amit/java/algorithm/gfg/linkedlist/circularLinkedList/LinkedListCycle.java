package home.amit.java.algorithm.gfg.linkedlist.circularLinkedList;
/*
User :- AmitSingh
Date :- 7/17/2023
Time :- 9:46 PM
Year :- 2023
*/

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle found
    }

    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
//        node5.next = node3; // Create a cycle
        node5.next = node6;

        LinkedListCycle cycleDetector = new LinkedListCycle();
        boolean hasCycle = cycleDetector.hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
