package home.amit.java.basic.misc;

import java.util.PriorityQueue;
import java.util.Queue;


// In PriorityQueue by default bigger number will come first


public class KthLargest {
	
	
	 public static void main(String[] args) {
	        int[] array = new int[] {4, 10, 3, 5, 1,11,12,13,14,15,161,70};
	        System.out.println(new KthLargest().findKthLargest(array, 2));
	    }
	 
	    public int findKthLargest(int[] numbs, int k) {
	        Queue<Integer> q = new PriorityQueue<>(k);
	        for (int i : numbs) {
	            q.offer(i);
	 
	            if (q.size() > k) {
					System.out.println("Removing "+q.peek());
	                q.poll();
	            }
	        }
	        System.out.println(q); //To print all k Largest elements
	        return q.peek(); //To print kth Largest element
	    }

}
