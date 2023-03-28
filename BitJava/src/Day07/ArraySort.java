package Day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySort {
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,12,3,2,1};
		Arrays.sort(arr);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		arr2.add(20);
		arr2.add(0);
		arr2.add(100000);
		Collections.sort(arr2);
		System.out.println(arr2);
	}
	

}
