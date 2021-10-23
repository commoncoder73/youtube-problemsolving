import java.util.*;

//time comp - O(N^2)
//space comp - O(1)
public class BruteForce {
	
	public static void main(String...args) {
		int[] arr = new int[] {5, 8, 9, 10, 12, 15};
		int targetSum = 30;
		BruteForce solution = new BruteForce();
		int[] result = solution.findTargetSumInSortedArray(arr, targetSum);
		
		if(result.length > 0){
			System.out.println("We got pair with target sum and that pair is...");
			System.out.println(result[0]);
			System.out.println(result[1]);
		}
		else {
			System.out.println("We didn't find any pair with target sum!");
		}
		
	}
	
	//5, 8, 9, 10, 12, 15
	public int[] findTargetSumInSortedArray(int[] arr, int targetSum) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] + arr[j] == targetSum) {
					return new int[] {arr[i], arr[j]};
				}
			}
		}
		return new int[] {};
	}
	
}
