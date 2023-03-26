package Array;

import java.util.Arrays;
import java.util.Scanner;

public class firstArrayExample {

	int[] m = new int[10];// [0][0][0][0][0]

	// 배열?�� 꽉찾?���? ?��?��?��?��.
	public boolean isFull() {
		if (m[m.length - 1] == 0) {
			return false;
		}
		return true;
	}

	// 비어?��?�� 배열?���? ?��?��?��?��.
	public int isEmpty() {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == 0) {
				return i;
			}
		}
		return -1;
	}

	// 배열?�� 꽉차?�� ?��칠때 배열?�� 길이 ?��배로 ?��?��주기
	public void increment() {
		if (isFull()) {

			int[] tmp = new int[m.length];
			for (int i = 0; i < m.length; i++) {
				tmp[i] = m[i];
			}

			m = new int[2 * m.length];
			for (int i = 0; i < tmp.length; i++) {
				m[i] = tmp[i];
			}
		}
	}

	// ?��?�� ?��?�� n ?�� 찾아�??��
	public int search(int n) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == n) {
				return i;
			}
		}
		return -1;
	}

	// before?�� after�? ?��?��?���??��
	public void modify(int before, int after) {
		int index = search(before); // -1 ?��?? ?��?��?���?

		if (index != -1) {
			m[index] = after;
		}
	}

	// ?��?�� ?��?���? delete?��?��.
	public void delete(int n) {
		int index = search(n);

		if (search(n) != -1) {
			for (int i = index; i < m.length - 1; i++) {
				m[i] = m[i + 1];
			}
			m[m.length - 1] = 0;
		}

	}

	// ?��?��?�� 1개일?�� 처리?��주기
	public void add(int data) {
		if (isFull()) {
			increment();
			if (isEmpty() != -1) {
				m[isEmpty()] = data;
			}
		} else {
			if (isEmpty() != -1) {
				m[isEmpty()] = data;
			}
		}

	}

	// ?��?��?�� 2개일?�� 처리?��주기
	public void add(int fdata, int sdata) {
		add(fdata);
		add(sdata);
	}

	public static void main(String[] args) {

		firstArrayExample a = new firstArrayExample();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1: add 2: search 3: modify 4: delete 5: print 6: exit");

			int tc = sc.nextInt();

			switch (tc) {

			case 1:
				System.out.println("add?�� 값을 1�? ?��?��?��주세?��");
				int tc1 = sc.nextInt();
				a.add(tc1);
				break;

			case 2:
				System.out.println("찾을 값을 ?��?��?�� 주세?��");
				int tc2 = sc.nextInt();
				System.out.println(a.search(tc2));
				break;

			case 3:
				System.out.println("?���? 값과 ?��?��?�� 값을 ?��?��주세?��");
				int tc3 = sc.nextInt();
				int tc4 = sc.nextInt();
				a.modify(tc3, tc4);
				break;

			case 4:
				System.out.println("?��?��?�� 값을 ?��?��?�� 주세?��");
				int tc5 = sc.nextInt();
				a.delete(tc5);
				break;

			case 5:
				System.out.println(Arrays.toString(a.m));
				break;

			case 6:
				System.exit(0);
			}

		}

	}
}
