import java.util.*;

//time comp. - O(N*logN)
//space comp. - O(1)
public class TwoPointersBasedApproachUnSorted {
	
	public static void main(String...args) {
		int[] arr = new int[] {15, 9, 10, 8, 12, 5};
		int targetSum = 30;
		
		TwoPointersBasedApproachUnSorted solution = new TwoPointersBasedApproachUnSorted();
		
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
	
	//15, 9, 10, 8, 12, 5
	public int[] findTargetSumInSortedArray(int[] arr, int targetSum) {
		Arrays.sort(arr); // O(N*logN)
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
