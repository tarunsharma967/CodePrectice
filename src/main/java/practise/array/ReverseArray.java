package  practise.array;

/**
 * author: tarunsharma967
 * URL: https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
 * Topic: Array
 */
public class ReverseArray
{
    public static void main(String[] args) 
    {
        int arr1[] = {1 ,2 , 3 ,4,5}; //Odd no of elements
        reverse(arr1);
        printArray(arr1);
        int arr2[] = {1 ,2 , 3 ,4,5, 6}; // even no of elements
        reverse(arr2);
        printArray(arr2);
        int arr3[] = {7}; // one element
        reverse(arr3);
        printArray(arr3);
    }

    public static void reverse(int [] arr)
    {
        int start;
        int end;
        int temp;
        for(start = 0, end = (arr.length - 1); start < end ; start++, end--)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static void printArray(int [] arr)
    {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

}