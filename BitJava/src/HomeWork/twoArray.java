package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class twoArray {

	// 일단 2 5 지정하기
	int[][] arr = new int[2][5];
	// 꽉 차면 세로로 길어지는 구조 -> 5는 고정이다.

	// 해당 값의 index 넣기
	static StringBuilder searchBuilder = new StringBuilder();

	// 초기값을 0이 아닌 -1로 설정 -> 0으로하면 인덱스 오류
	public void arrReset() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = -1;
			}
		}
	}

	// isFull -> 전부다 찾는지 확인하기 -> 마지막 꺼만 check;
	public boolean isFull() {
		// 제일 마지막 값이 -1이 아니면 꽉찬거임.
		if (arr[arr.length - 1][4] != -1)
			return true;
		return false;
	}

	// emptyIndex -> 비어있으면 비어있는거의 해당 index 반환
	// emptyIndex -> 비어있는지 확인 -> 비면 해당 인덱스 리턴
	// 만약 tmp의 값이 tmp[0]의 값이 -1 이면 비어있는거임
	public int[] emptyIndex() {
		int[] tmp = new int[2];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				// -1이면 비어있다
				if (arr[i][j] == -1) {
					tmp[0] = i;
					tmp[1] = j;
					return tmp;
				}
			}
		}

		// 비어있는게 없으면 tmp = [-1,-1]; 이 반환된다.
		tmp[0] = -1;
		tmp[1] = -1;
		return tmp;
	}

	// increment -> 꽉찾을때 2 5 -> 3 5 로 늘려주기
	public void increment() {
		// isFull-> 꽉찾을때만 확장해준다
		// 꽉 안찾으면 바로 return
		if (!isFull())
			return;

		// tmp -> arr랑 같은 사이즈의 배열을 선언해놓고,
		// 같은 배열을 복사해놓는다
		int[][] tmp = new int[arr.length][5];
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < 5; j++) {
				tmp[i][j] = arr[i][j];
			}
		}

		arr = new int[arr.length + 1][5];
		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = tmp[i][j];
			}
		}

		// 확장하고 제일 마지막 줄은 -1로 초기화
		for (int i = 0; i < 5; i++) {
			arr[arr.length - 1][i] = -1;
		}
	}

	// search -> 해당 값의 인덱스 반환 -> 만약 동일한값이 여러개라면 여러개 전부 sb에 넣기
	// 해당 값을 찾았을때 그냥 sb에 넣기
	public void search(int n) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] != n)
					continue;

				searchBuilder.append("arr[" + i + "]" + "[" + j + "] ");
			}
		}
	}

	// modify -> 해당값을 넣으면 해당 자리에 수정할값 넣기 -> 만약 수정할 값이 여러개라면 전부다 바꾸기
	public void modify(int a, int b) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] != a)
					continue;

				arr[i][j] = b;
			}
		}
	}

	// 특정 값 n 삭제 -> 해당 값을 찾아서 해단 자리를 -1로 변경 -> 전체 삭제
	public void delete(int n) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[i][j] != n)
					continue;

				// 초기 값은 -1
				arr[i][j] = -1;
			}
		}

		// 만약에 삭제된 값이면 앞으로 당기는 logic이 필요하다.
		// arr를 tmp에 복사해두고, arr를 -1로 초기화 시키고, tmp에서 -1이 아닌값만 하나씩 arr로 다시 가져오기
		// why? -> 만약 같은 값이 여러개 있으면 전부 삭제 시키기 때문에
		int[][] tmp = new int[arr.length][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				tmp[i][j] = arr[i][j];
			}
		}

		arrReset();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 5; j++) {
				if (tmp[i][j] != -1) {
					add(tmp[i][j]);
				}
			}
		}

	}

	// add 일단 한개만 추가할때
	public void add(int n) {
		int[] k = emptyIndex();

		// 가득 차 있으면 확장시켜야함
		if (isFull())
			increment();

		// 비어있는거 찾기 -> k[X,X] 에 값이 들어가있으면 비어있는거다.
		if (k[0] != -1) {
			arr[k[0]][k[1]] = n;
		}
	}

	// OverLoad
	public void add(int a, int b) {
		add(a);
		add(b);
	}

	// main메서드 -> 입력받고 -> switch 돌려서 진행하기
	public static void main(String[] args) {
		twoArray t = new twoArray();
		// arrReset으로 -1 먼저 넣기
		t.arrReset();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1: add 2: 2개 이상 add 3: search 4: modify 5: delete 6: print 7: exit");

			int tc = sc.nextInt();

			switch (tc) {

			case 1:
				System.out.println("0 이상의 add할 값 1개 입력해 주세요");
				int tc1 = sc.nextInt();
				t.add(tc1);
				break;

			case 2:
				System.out.println("0 이상의 add할 값을 2개 입력해 주세요");
				int c1 = sc.nextInt();
				int c2 = sc.nextInt();
				t.add(c1, c2);
				break;

			case 3:
				System.out.println("search 할 값을 입력해 주세요(동일 한 값이 여러개라면 모두 return 합니다)");
				int tc2 = sc.nextInt();
				t.search(tc2);
				System.out.println(searchBuilder);
				break;
			// 넣고 출력하기

			case 4:
				System.out.println("원본값 a와 수정할 값 b를 입력해 주세요(전체 수정 합니다)");
				int tc3 = sc.nextInt();
				int tc4 = sc.nextInt();
				t.modify(tc3, tc4);
				break;

			case 5:
				System.out.println("삭제할 값을 입력해 주세요(전체 삭제 합니다)");
				int tc5 = sc.nextInt();
				t.delete(tc5);
				break;

			case 6:
				System.out.println(Arrays.deepToString(t.arr));
				break;

			case 7:
				System.exit(0);
			}
		}

	}

}
