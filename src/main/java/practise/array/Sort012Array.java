package practise.array;
/**
 * author: tarunsharma967
 * URL: https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
 * Topic: Array
 */
public class Sort012Array 
{
    public static void main(String... argvs) 
    {
        int arr1[] = {0,1,1,2,0,0,1,2,0,1};
        sortArray(arr1);
        printArray(arr1);
        int arr2[] = {0,2,1,2,0};
        sortArray(arr2);
        printArray(arr2);
        int arr3[] = {0,1,0};
        sortArray(arr3);
        printArray(arr3);

    }

    public static void sortArray(int arr[])
    {
        int zeros = 0;
        int once = 0;

        for(int no : arr){
            if(no == 0) zeros++;
            if(no == 1) once++;
        }

        for(int i = 0; i < arr.length ; i++){
            if(zeros > 0){
                arr[i] = 0;
                zeros--;
            } else if(once > 0){
                arr[i] = 1;
                once--;
            } else {
                arr[i] = 2;
            }
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
