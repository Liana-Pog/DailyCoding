/**
This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

**/

public class Day_1{	

	/**the time complexity of this solution is O(n^2), this is a brute force solution. */
	public static boolean check(int arr[], int k){
		int a = arr.length;
		for (int i=0; i<a; i++){
			for (int j=0; j<a;j++){
				if(arr[i] + arr[j] == k)
					return true;
			}
		}
		return false;
	} 

	public static void main(String[] args){
		int arr[] = { 10,15,3,7};
		int k = 10;
		System.out.println(check(arr,k));		

	}
}


