package practise.array;


/**
 * author: tarunsharma967
 * URL: https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
 * Topic: Array
 */
public class MinMaxElement
{
    public static void main(String arg[])
    {
        int arr1[] = {1000, 11, 445, 1, 330, 3000};
        printMinMax(arr1);
        int arr2[] = {1000, 11};
        printMinMax(arr2);
        int arr3[] = {445};
        printMinMax(arr3);
    }

    public static void printMinMax(int arr[])
    {
        int minIdx = 0;
        int maxIdx = 0;

        for(int i = 1; i < arr.length ; i++)
        {
            if(arr[i] < arr[minIdx])
            {
                minIdx = i;
            }
            if(arr[i] > arr[maxIdx])
            {
                maxIdx = i;
            }
        }
        System.out.println("Min: "+ arr[minIdx] + " Max: "+arr[maxIdx]);
    }
}