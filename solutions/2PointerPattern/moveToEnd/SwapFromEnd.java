import java.util.*;

//time comp - O(N)
//space comp - O(1);
public class SwapFromEnd {
	
	public static void main(String...args) {
		int[] arr = new int[] {8, 3, 5, 2, 3, 3, 1, 9, 3};
		int targetElement = 3;
		SwapFromEnd solution = new SwapFromEnd();
		int[] result = solution.moveTargetElementToEnd(arr, targetElement);
		System.out.println(Arrays.toString(result));
	}

	public int[] moveTargetElementToEnd(int[] arr, int targetElement) {
		int n = arr.length;
		int i = n-1;
		int j = 0;

		while(i>j) {
			if (arr[i] == targetElement) {
				i--;
				continue;
			}
			swap(arr, i, j);
			j++;
		}
		return arr;
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
