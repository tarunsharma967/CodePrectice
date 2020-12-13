package practise.array;

import java.util.Arrays;

/**
 * author: tarunsharma967
 * URL: https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1
 * Topic: Array
 */
public class KthMinMax
{
    public static void main(String arg[])
    {
        int arr1[] = {1000, 11, 445, 1, 330, 3000};
        printKthMinMax(arr1, 1);
        printKthMinMax(arr1, 2);
        printKthMinMax(arr1, 3);
        printKthMinMax(arr1, 4);
        printKthMinMax(arr1, 5);
        printKthMinMax(arr1, 6);
    }

    public static void printKthMinMax(int arr[], int k)
    {
        sortArray(arr);
        System.out.println("Min: "+ arr[k-1]+" Max : "+arr[arr.length - k]);
    }

    private static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }
}