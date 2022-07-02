package home.amit.java.algorithm.arrays;

public class MedianArray {

    static double median(int[] values)
    {
        double result = 0;
        int index;
        if ( values.length%2 !=0 )
        {
            index = values.length/2;
            result = values[index];
        }
        else
        {
            index = values.length/2;
            result = (double)(values[index]+values[index-1])/2;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] values = { 2, 3, 6, 12, 15, 34, 65, 78, 99 };
        // calculate median
        double median = median(values);
        System.out.println("Median is : " + median);
        // re-initialize array with even number of element
        values = new int[]{2, 3, 6, 12, 15, 34, 65, 78};
        // calculate median
        median = median(values);
        System.out.println("Median is : " + median);
     }
}
