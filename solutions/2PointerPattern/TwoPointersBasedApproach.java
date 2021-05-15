import java.util.*;

//time comp. - O(N)
//space comp. - O(1)
public class TwoPointersBasedApproach {
	
	public static void main(String...args) {
		int[] arr = new int[] {5, 8, 9, 10, 12, 15};
		int targetSum = 19;
		
		TwoPointersBasedApproach solution = new TwoPointersBasedApproach();
		
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
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			if(arr[i] + arr[j] == targetSum) {
				return new int[] {arr[i], arr[j]};
			}
			else if(arr[i] + arr[j] < targetSum) {
				i++;
			}
			else if (arr[i] + arr[j] > targetSum) {
				j--;
			}
		}
		return new int[] {};
	}	
	
}
