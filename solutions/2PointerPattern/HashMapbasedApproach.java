import java.util.*;

//time comp. - O(N)
//space comp. - O(N)
public class HashMapbasedApproach {
	
	public static void main(String...args) {
		int[] arr = new int[] {5, 8, 9, 10, 12, 15};
		int targetSum = 30;
		
		HashMapbasedApproach solution = new HashMapbasedApproach();
		
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
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				return new int[] {arr[i] , map.get(arr[i])};
			}
			
			int otherElement = targetSum - arr[i];
			map.put(otherElement, arr[i]);			
		}
		return new int[] {};
	}	
	
}
