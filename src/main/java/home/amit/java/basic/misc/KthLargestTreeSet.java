package home.amit.java.basic.misc;

import java.util.*;

public class KthLargestTreeSet {
	
	
	 public static void main(String[] args) {
	        int[] array = new int[] {4, 10, 3, 5, 1,11,12,13,14,15,161,70};
	        System.out.println(new KthLargestTreeSet().findKthLargest(array, 2));
	    }
	 
	    public int findKthLargest(int[] nums, int k) {
	        var tset = new TreeSet<Integer>();
	        for (int i : nums) {
				tset.add(i);
	        }

	        int size= tset.size();
	        int count=0;
	        int result=Integer.MIN_VALUE;
			final Iterator iterator = tset.iterator();
			System.out.println("Before "+tset);
	        while (iterator.hasNext())
			{
				count++;
				//System.out.println(iterator.next());
				int num=(Integer)iterator.next();
				if (count==size-1)
				{
					result= num;
					break;
				}
			}
		return result;
		}

}
