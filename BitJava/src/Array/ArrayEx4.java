package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayEx4 {

//	public double[] getvalue(int ...x) {
//		double[] d = {Math.sqrt(x[0]),Math.sqrt(x[1]),Math.sqrt(x[2])};
//		return d;
//	}
//	
//	public static void main(String[] args) {
//		ArrayEx4 a = new ArrayEx4();
//		for(double v: a.getvalue(10,20,30)) {
//			System.out.printf("%.2f ", v);
//		}
//	}

	public double[] getValue(int... x) {
		return new double[] { Math.sqrt(x[0]), Math.sqrt(x[1]), Math.sqrt(x[2]) };
	}

	public void addValue(int[] x) {// 1차원
		System.out.println("public void addValue(int[]x)");
	}

	public int addValue(int[][] x) {// ?��차원
		System.out.println("public void addValue(int[][] x");
		return x[0][0];
	}

	public void arrayEx1() {
		int[][] m = new int[2][];

		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = { 6, 7, 8, 9 };
		m[0] =x;
		m[1] = y;
		for(int i = 0; i<m.length;i++) {
			System.out.println(Arrays.toString(m[i]));
		}

	}

	public static void main(String[] args) {
		ArrayEx4 a = new ArrayEx4();
		a.arrayEx1();
	}
	
	public void arrayEx2() {
		ArrayList<Integer> i = new ArrayList<Integer>();
		
		
	}

}
