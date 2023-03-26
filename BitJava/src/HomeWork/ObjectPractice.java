package HomeWork;

import java.util.*;

public class ObjectPractice {

	// 이름ㅇ, 나이ㅇ, 오늘생일ㅇ, 성별ㅇ,나이평균ㅇ, 나이별 정렬ㅇ, 성씨별 인원수,지역ㅇ, 띠ㅇ,

	StringTokenizer st;
	static String[] Ddi = { "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양" };
	static String[] member = { "공지현#961210-1010678#051)234-8910", "김가영#990119-2010678#02)934-8910",
			"김민준#580219-1010978#031)734-8910", "김병훈#880323-1910678#02)634-8910", "박규민#960210-1010678#051)234-8910" };

	// member.length = 5
	int k = member.length;
	// 이름 객체
	String[] name = new String[k];
	// 주민번호 객체
	String[] ssn = new String[k];
	// 나이 객체
	int[] age = new int[k];
	// 전화번호 객체
	String[] pn = new String[k];
	// 생일여부
	String[] BrithdayChk = new String[k];
	// 성별
	String[] gender = new String[k];
	// 띠
	String[] Ddians = new String[k];
	// 그사람이 사는 지역
	String[] stayLocal = new String[k];

	// 사람 성씨가 들어갈 arraylist
	ArrayList<String> surname = new ArrayList<String>();
	// 사람 성씨 Cnt
	HashMap<String, Integer> surname_cnt = new HashMap<>();

	// 한개씩 쪼개서 name 객체에 넣기
	public void input(String[] m) {
		ObjectPractice o = new ObjectPractice();
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(o.member[i], "#");
			this.name[i] = st.nextToken();
			this.ssn[i] = st.nextToken();
			this.pn[i] = st.nextToken();
		}
	}

	// 나이
	public void ageCalc() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // year 2023
		for (int i = 0; i < k; i++) {
			String tmp = ssn[i];
			int tmp1 = Integer.parseInt(tmp.substring(0, 2));
			age[i] = year - (tmp1 + 1900) + 1;
		}
	}

	// 오늘 생일인지
	public void BirthdayCheck() {
		Calendar now = Calendar.getInstance();
		// 1월이 0이다

		// 월
		int mon = now.get(Calendar.MONTH) + 1;
		// 날짜
		int day = now.get(Calendar.DATE);
		int md = mon + 1000 + day;

		for (int i = 0; i < k; i++) {
			String tmp = ssn[i];
			int tmp1 = Integer.parseInt(tmp.substring(2, 6)); // 990225 에서 0225를 잘라왔다 정수형으로
			if (tmp1 == md) {
				BrithdayChk[i] = name[i] + ": 오늘이 생일입니다! ";
			} else {
				BrithdayChk[i] = name[i] + ": 오늘은 생일이 아닙니다! ";
			}
		}
	}

	// 성별
	public void gender() {
		for (int i = 0; i < k; i++) {
			String tmp = ssn[i];
			int tmp1 = Integer.parseInt(tmp.substring(7, 8));
			if (tmp1 == 1) {
				gender[i] = name[i] + ": 남";
			} else if (tmp1 == 3) {
				gender[i] = name[i] + ": 남";
			} else if (tmp1 == 2) {
				gender[i] = name[i] + ": 여";
			} else if (tmp1 == 4) {
				gender[i] = name[i] + ": 여";
			} else {
				gender[i] = "잘못된 데이터 입니다.";
			}
		}
	}

	// 지역
	public void local() {
		for (int i = 0; i < k; i++) {
			String tmp = pn[i];
			int l = tmp.indexOf(')');
			String s = tmp.substring(0, l);
			// 정수로 받으면 051 ->51
			if (s.equals("051")) {
				stayLocal[i] = name[i] + ": 부산";
			} else if (s.equals("02")) {
				stayLocal[i] = name[i] + ": 서울";
			} else if (s.equals("031")) {
				stayLocal[i] = name[i] + ": 경기도";
			} else {
				stayLocal[i] = "등록되지 않은 지역 입니다.";
			}
		}
	}

	// 띠
	public void ansDdi() {
		for (int i = 0; i < k; i++) {
			String tmp = ssn[i];
			int Byear = Integer.parseInt(tmp.substring(0, 2)) + 1900;
			int index = Byear % 12;
			Ddians[i] = name[i] + ": " + Ddi[index];
		}

	}

	// 나이평균
	public int avgAge() {
		int total = 0;
		for (int i = 0; i < k; i++) {
			total += age[i];
		}
		return total / 5;
	}

	// 나이별 정렬
	public int[] sortAge() {
		int[] sortAge = new int[k];
		for (int i = 0; i < k; i++) {
			sortAge[i] = age[i];
		}
		Arrays.sort(sortAge);
		return sortAge;
	}

	public void surnameCnt() {
		// 성만 따서 surname ArrayList 에 넣기
		for (int i = 0; i < k; i++) {
			String tmp = name[i];
			char k = tmp.charAt(0);
			String s = String.valueOf(k);
			surname.add(s);
		}

		// HashMap으로 중복찾기
		for (int i = 0; i < surname.size(); i++) {
			if (surname_cnt.containsKey(surname.get(i))) {
				surname_cnt.put(surname.get(i), surname_cnt.get(surname.get(i)) + 1);
			} else {// 한번도 안나왔을 때 키값을 만들고 value를 1로
				surname_cnt.put(surname.get(i), 1);
			}
		}
	}

	// 성씨별 인원수
	public static void main(String[] args) {
		ObjectPractice o = new ObjectPractice();
		o.input(member);

		o.printAns();
	}

	// 각각의 메소드는 여기 불러서 찍어내기
	public void printAns() {
		// 쪼개서 3개의 객체에 넣기
		// 이름 출력
		System.out.println("<이름>");
		for (String str : name) {
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println();
	
		// 나이를 출력
		ageCalc();
		System.out.println("<나이>");
		for (int i : age) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();

		// 생일 인지 출력
		BirthdayCheck();
		System.out.println("<오늘 생일 여부>");
		for (String s : BrithdayChk) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();
	
		// 성별 출력
		gender();
		System.out.println("<성별>");
		for (String s : gender) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();

		// 나이평균
		System.out.println("나이의 평균은(버림): " + avgAge());
		System.out.println();

		// 나이 오름차순 정렬
		sortAge();
		System.out.println("<나이의 오름차순 정렬>");
		for (int i : sortAge()) {
			System.out.print(i + " ");
		}
		System.out.println();

		//띠 출력
		ansDdi();
		System.out.println();
		System.out.println("<개개인의 띠>");
		for (String s : Ddians) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 지역 출력
		local();
		System.out.println();
		System.out.println("<개인이 사는 지역>");
		for (String s : stayLocal) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 각각 성씨 cnt한 뒤 출력
		surnameCnt();
		System.out.println();
		System.out.println("<각각 성씨의 갯수>");
		System.out.println(surname_cnt);
	}
}
