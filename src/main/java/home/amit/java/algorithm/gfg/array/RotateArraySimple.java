package home.amit.java.algorithm.gfg.array;

import java.util.Arrays;

public class RotateArraySimple {

    public void rotateArray(int[] array, int d, int size) {
        int[] result = new int[size];
        int resultCounter = 0;

        d = d % size;

        for (int i = d; i < size; i++) {
            result[resultCounter++] = array[i];
        }
        for (int k = 0; k < d; k++) {
            result[resultCounter++] = array[k];
        }

        System.arraycopy(result, 0, array, 0, size);
    }


    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[5];
        array2 = array;
        int d = 12;
        int size = array.length;
        // Arrays.stream(array).forEach(e-> System.out.println(e));
        RotateArraySimple rotateArraySimple = new RotateArraySimple();
        rotateArraySimple.rotateArray(array, d, size);

        Arrays.stream(array).forEach(e -> System.out.println(e));


    }
}
