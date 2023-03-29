package Day08_4;

import java.util.Scanner;

public class ExceptionEx4 {
	Scanner sc = new Scanner(System.in);

	public void exceptionAction() {
		System.out.println("Data Input: ");
		int value = sc.nextInt();
		try {
			if (value < 0 || value >= 100) {
				throw new UserException("양수 0~100 까지만 넣으세요!!!!!");
			}
			System.out.println(value+ " -> 정상입력");
		} catch (UserException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExceptionEx4 e = new ExceptionEx4();
		e.exceptionAction();
	}

}
