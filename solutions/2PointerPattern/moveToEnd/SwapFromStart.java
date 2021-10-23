import java.util.*;

//time comp - 
//space comp - 
public class SwapFromStart {
	
	public static void main(String...args) {
		int[] arr = new int[] {8, 3, 5, 2, 3, 3, 1, 9, 3};
		int targetElement = 3;
		SwapFromStart solution = new SwapFromStart();
		int[] result = solution.moveTargetElementToEnd(arr, targetElement);
		System.out.println(Arrays.toString(result));
	}

	public int[] moveTargetElementToEnd(int[] arr, int targetElement) {
		
	}
	
}
