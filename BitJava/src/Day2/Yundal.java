package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Yundal {
	static int[] arr = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		//?€? κ΅¬λΆ?λ©΄μ arr[1]? ?£κΈ?
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			arr[1] = 29;
		} else {
			arr[1] = 28;
		}
		
		//check ?΄? a b c κ°? ? μ§? λ²μ?? ??κ±΄μ? ??Έ?κΈ?
		if (check(a, b, c)) {
			int yearTotal = (a - 1) * 365 + ((a - 1) / 4) - ((a - 1) / 100) + ((a - 1) / 400);

			int monTotal = 0;
			for (int num = 0; num < b - 1; num++) {
				monTotal += arr[num];
			}

			int ans = yearTotal + monTotal + c;

			switch (ans % 7) {
			case 1:
				System.out.println("?");
				break;
			case 2:
				System.out.println("?");
				break;
			case 3:
				System.out.println("?");
				break;
			case 4:
				System.out.println("λͺ?");
				break;
			case 5:
				System.out.println("κΈ?");
				break;
			case 6:
				System.out.println("? ");
				break;
			case 7:
				System.out.println("?Ό");
				break;
			}

		}else {
			System.out.println("?λͺ? ?? ₯ ??¨?΅??€.");
		}
		
		br.close();
	}

	
	static boolean check(int a, int b, int c) {
		//??? ??΄? μ‘°κ±΄λ²μ ?? ??΄?Ό?¨
		if ((1 <= a) && (1 <= b) && (b < 13)) {
			//2??¬?΄ ?΄?Ή λ²μ???΄?Ό?¨
			if (c <= arr[b - 1]) {
				return true;
			}
			return false;
		}
		return false;
	}
}
