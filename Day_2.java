/** 
[Hard]

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

*/

public class Day_2 {

    public static int[] i_omit_product(int[] arr) {
        int a = arr.length;
        int newest[] = new int[a];
        int product=1;
        for (int i = 0; i < a ; i++) {
            product *= arr[i];
        }
        for (int j=0; j < a ; j++){
	    newest[j] = product/arr[j];
	}
        return newest;


    }

    public static void main(String[] args) {
        int arr0[] = {1,2,3,4,5};
        int a = arr0.length;
        int arr1[] = new int[a];
        arr1 = i_omit_product(arr0);
        for (int i = 0; i < a; i++) {
            System.out.print(arr1[i] + " ");
        }


    }
}
