package home.amit.java.algorithm.leetcode;


//Definition for singly-linked list.


// 10->20->30->40
class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode n1, n2;
        while (prev != null) {
            n1 = prev.next;
            if (n1 == null || n1.next == null) break;
            n2 = n1.next;
            // prev n1 n2 n3 n4
            prev.next = n2;
            n1.next = n2.next;
            n2.next = n1;
            prev = n1;
        }
        return dummy.next;
    }

//    public ListNode swapPairsRecursion(ListNode head) {
//
//        if (head == null || head.next == null) return head;
//        ListNode pointer= head;
//        while (head.next!=null)
//        {
//            ListNode temp=head
//
//
//
//        }
//
//
//
//        return dummy.next;
//    }
//


}

public class ListNodeSweepInPairs {

    public static void main(String[] args) {
        ListNode head = new ListNode(10, new ListNode(20, new ListNode(30, new ListNode(40))));
        ListNode node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
        Solution solution = new Solution();
        solution.swapPairs(head);
    }

}
