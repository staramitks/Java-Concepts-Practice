package home.amit.java.exams.bloomberg;

public class MoveZeroEndOfArrayOrder {

    public void moveZeros(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        int zIndex=0;

        for (start=0; start<=end ;start++)
        {
            if (arr[start] == 0)
            {
                zIndex=start;
                for (int nzindex=zIndex+1; nzindex<=end; nzindex++)
                {

                    if ( arr[nzindex] !=0 )
                    {
                        arr[zIndex]=arr[nzindex];
                        arr[nzindex]=0;
                        break;
                    }
                    if (nzindex== end)
                    {
                        break;
                    }
                }
            }
        }

        System.out.println(arr);

    }

    public void moveZerosToEnd(int arr[], int n) {
        int w = 0;
        for(int i= 0;i<n;i++) {
            if (arr[i] != 0) {
                arr[w++] = arr[i];
            }
        }
            while (w < n) {
                arr[w++] = 0;
            }

        System.out.println(arr);
    }

    public static void main(String[] args) {

        int[] array= {3,5,8,0,1,0,4,6,0,2,9,0,0,4,3};

        MoveZeroEndOfArrayOrder moveZerosEndOfArray= new MoveZeroEndOfArrayOrder();
        moveZerosEndOfArray.moveZeros(array);
        moveZerosEndOfArray.moveZerosToEnd(array,15);

    }
}
