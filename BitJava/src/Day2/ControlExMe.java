package Day2;

import java.util.Calendar;


public class ControlExMe {
	static String[] strDDi = {"??­?΄" ,"?­", "κ°?", "?Όμ§?", "μ₯?", "?", "?Έ??΄", "? ?Ό", "?©", "λ±?", "λ§?", "?"};
	static String[] strWeek = { "?Ό??Ό", "???Ό", "???Ό", "???Ό", "λͺ©μ?Ό", "κΈμ?Ό", "? ??Ό" };

	// ?? ?? ₯?λ©? ??΄get
	public int getAge(int year) {
		return (Calendar.getInstance().get(Calendar.YEAR) - year) + 1;
	}

	// ?? ?? ₯?λ©? ? get
	public String getDddi(int year) {
		int index = year % 12;
		return strDDi[index];
	}

	// ?€?¬ μ²΄ν¬?κΈ?
	public boolean yunDal(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	// ? ??Ό ?? ₯?λ©? ?΄?κΉμ? μ΄? ?Ό?
	public int getCount(int year, int month, int day) {
		int total = (year - 1) * 365;
		// μ§μ  ?¬κΉμ??κΉ?
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
				// 2??Έ?° ?€?¬?΄λ©? 29 ??λ©? 28
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

	//??Ό get?κΈ?
	public String getWeek(int year, int month, int day) {
		return strWeek[getCount(year,month,day) % 7];
	}
	// λͺλ λͺμ λͺμΌ ?Έμ§? ?£κΈ?
	public void inputValue(int year, int month, int day) {
		int age = getAge(year);
		String ddi = getDddi(year);
		String week = getWeek(year, month, day);
		outputValue(age, ddi, week);
	}

	// λͺλ λͺμ λͺμΌ ? ?£?΄μ£Όλ©΄ ??΄, ? , ??Ό μΆλ ₯
	public void outputValue(int age, String ddi, String week) {
		System.out.println("Age: " + age + " Dddi: " + ddi + " week: " + week);
	}

	public static void main(String[] args) {
		ControlExMe c = new ControlExMe();
		c.inputValue(2022, 3, 21);
	}
}