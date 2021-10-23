import java.util.*;

//time comp - O(N)
//space comp - O(N)
public class BruteForce {
	
	public static void main(String...args) {
		int[] arr = new int[] {8, 3, 5, 2, 3, 3, 1, 9, 3};
		int targetElement = 3;
		BruteForce solution = new BruteForce();
		int[] result = solution.moveTargetElementToEnd(arr, targetElement);
		System.out.println(Arrays.toString(result));
	}

	public int[] moveTargetElementToEnd(int[] arr, int targetElement) {
		int n = arr.length;
		int[] result = new int[n];
	
		int ptr = 0;
		int resPtr = 0;

		while(ptr<n) {
			if (arr[ptr] == targetElement) {
				ptr++;
				continue;
			}
			result[resPtr] = arr[ptr];
			resPtr++;
			ptr++;
		}

		while(resPtr<n) {
			result[resPtr] = targetElement;
			resPtr++;
		}
		return result;
	}
	
}
