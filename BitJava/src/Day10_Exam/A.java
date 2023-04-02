package Day10_Exam;

import java.util.Scanner;

public class A {
	
	
	public static void main(String[] args) {
		int a = 3;
		int b= 5;
		int c = 4;
		
		if(a++>b & ++c<b) {
			System.out.println("위에꺼");
		}else {
			System.out.println("밑에꺼");
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
