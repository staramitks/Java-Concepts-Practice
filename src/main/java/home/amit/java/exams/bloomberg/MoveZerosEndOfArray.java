package home.amit.java.exams.bloomberg;

public class MoveZerosEndOfArray {



    void pushZerosToEnd(int[] arr) {
        // code here
        int start=0;
        int end=arr.length-1;

        for (start=0; start<=end ;start++)
        {
            if (arr[start] == 0)
            {
                for (end=arr.length-1 ; end>start ; end--)
                {

                    if (arr[end] !=0)
                    {
                        arr[start]=arr[end];
                        arr[end]=0;
                        break;
                    }
                }
            }
        }

        System.out.println(arr);
    }


    public static void main(String[] args) {

        int[] array= {3,5,8,0,1,0,4,6,0,2,9,0,0,4,3};

        MoveZerosEndOfArray moveZerosEndOfArray= new MoveZerosEndOfArray();
        moveZerosEndOfArray.pushZerosToEnd(array);

    }
}
