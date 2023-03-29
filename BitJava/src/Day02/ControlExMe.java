package Day02;

import java.util.Calendar;


public class ControlExMe {
	static String[] strDDi = {"?��?��?��" ,"?��", "�?", "?���?", "�?", "?��", "?��?��?��", "?��?��", "?��", "�?", "�?", "?��"};
	static String[] strWeek = { "?��?��?��", "?��?��?��", "?��?��?��", "?��?��?��", "목요?��", "금요?��", "?��?��?��" };

	// ?��?�� ?��?��?���? ?��?��get
	public int getAge(int year) {
		return (Calendar.getInstance().get(Calendar.YEAR) - year) + 1;
	}

	// ?��?�� ?��?��?���? ?��get
	public String getDddi(int year) {
		int index = year % 12;
		return strDDi[index];
	}

	// ?��?�� 체크?���?
	public boolean yunDal(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	// ?�� ?��?�� ?��?��?���? ?��?��까�? �? ?��?��
	public int getCount(int year, int month, int day) {
		int total = (year - 1) * 365;
		// 직전 ?��까�??���?
		for (int i = 1; i < year; i++) {
			if (yunDal(i))
				total++;
		}

		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				total += 31;
				break;
			case 2:
				// 2?��?��?�� ?��?��?���? 29 ?��?���? 28
				if (yunDal(year))
					total += 29;
				else
					total += 28;
				break;
			default:
				total += 30;
			}
		}
		return total;
	}

	//?��?�� get?���?
	public String getWeek(int year, int month, int day) {
		return strWeek[getCount(year,month,day) % 7];
	}
	// 몇년 몇월 몇일 ?���? ?���?
	public void inputValue(int year, int month, int day) {
		int age = getAge(year);
		String ddi = getDddi(year);
		String week = getWeek(year, month, day);
		outputValue(age, ddi, week);
	}

	// 몇년 몇월 몇일 ?�� ?��?��주면 ?��?��, ?��, ?��?�� 출력
	public void outputValue(int age, String ddi, String week) {
		System.out.println("Age: " + age + " Dddi: " + ddi + " week: " + week);
	}

	public static void main(String[] args) {
		ControlExMe c = new ControlExMe();
		c.inputValue(2022, 3, 21);
	}
}