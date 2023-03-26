package Day2;

import java.util.Calendar;


public class ControlExMe {
	static String[] strDDi = {"?›?ˆ­?´" ,"?‹­", "ê°?", "?¼ì§?", "ì¥?", "?†Œ", "?˜¸?‘?´", "?† ?¼", "?š©", "ë±?", "ë§?", "?–‘"};
	static String[] strWeek = { "?¼?š”?¼", "?›”?š”?¼", "?™”?š”?¼", "?ˆ˜?š”?¼", "ëª©ìš”?¼", "ê¸ˆìš”?¼", "?† ?š”?¼" };

	// ?…„?ˆ˜ ?…? ¥?•˜ë©? ?‚˜?´get
	public int getAge(int year) {
		return (Calendar.getInstance().get(Calendar.YEAR) - year) + 1;
	}

	// ?…„?ˆ˜ ?…? ¥?•˜ë©? ? get
	public String getDddi(int year) {
		int index = year % 12;
		return strDDi[index];
	}

	// ?œ¤?‹¬ ì²´í¬?•˜ê¸?
	public boolean yunDal(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	// ?…„ ?›”?¼ ?…? ¥?•˜ë©? ?´?•Œê¹Œì? ì´? ?¼?
	public int getCount(int year, int month, int day) {
		int total = (year - 1) * 365;
		// ì§ì „ ?‹¬ê¹Œì??‹ˆê¹?
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
				// 2?›”?¸?° ?œ¤?‹¬?´ë©? 29 ?•„?‹ˆë©? 28
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

	//?š”?¼ get?•˜ê¸?
	public String getWeek(int year, int month, int day) {
		return strWeek[getCount(year,month,day) % 7];
	}
	// ëª‡ë…„ ëª‡ì›” ëª‡ì¼ ?¸ì§? ?„£ê¸?
	public void inputValue(int year, int month, int day) {
		int age = getAge(year);
		String ddi = getDddi(year);
		String week = getWeek(year, month, day);
		outputValue(age, ddi, week);
	}

	// ëª‡ë…„ ëª‡ì›” ëª‡ì¼ ?„ ?„£?–´ì£¼ë©´ ?‚˜?´, ? , ?š”?¼ ì¶œë ¥
	public void outputValue(int age, String ddi, String week) {
		System.out.println("Age: " + age + " Dddi: " + ddi + " week: " + week);
	}

	public static void main(String[] args) {
		ControlExMe c = new ControlExMe();
		c.inputValue(2022, 3, 21);
	}
}