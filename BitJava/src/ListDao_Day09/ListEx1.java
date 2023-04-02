//Arraylist 메뉴판 예제
package ListDao_Day09;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

//private int no;
//private String title;
//private String writer;
//private String contents;
//private String password;
//private String regdate;

public class ListEx1 {

	private Scanner sc = new Scanner(System.in);
	private ArrayList list;

	// input Data -> input하고 BoardBean bean return
	public BoardBean inputData() {
		BoardBean bean = new BoardBean();
		int no = 0;
		// 예외처리 하기 -> 만약 no이 int 가 아니라면 다시 입력받기
		do {
//			System.out.println("id를 입력하세요");
//			try {
//			no = sc.nextInt();
//			}catch(InputMismatchException e) {
//				System.out.println("정수를 입력해 주세요");
//			}
			System.out.println("id를 입력해 주세요");
			no = sc.nextInt();
		} while (!ListDao.getDao().noCheck(no));

		bean.setNo(no);

//		System.out.println("title을 입력하세요");
//		String str = sc.next();
//		bean.setTitle(sc.next());
//
//		
//		System.out.println("writer를 입력하세요");
//		bean.setWriter(sc.next());
//		
//		System.out.println("contents를 입력하세요");
//		bean.setContents(sc.next());
//		
//		System.out.println("password를 입력하세요");
//		bean.setPassword(sc.next());
//		
//		System.out.println("regdate 등록일자 입니다");
//		Calendar c = Calendar.getInstance();
//		String Today = String.valueOf(c.get(Calendar.YEAR)).concat(String.valueOf(c.get(Calendar.MONTH)+1)).concat(String.valueOf(c.get(Calendar.DATE))).concat(String.valueOf(" "+c.get(Calendar.HOUR))).concat(String.valueOf(":"+c.get(Calendar.MINUTE))).concat(String.valueOf(":"+c.get(Calendar.SECOND)));
//		bean.setRegdate(Today); //오늘 날짜 얻어와서 찍기

		return bean;
	}

	// bean 입력하면 data insert
	public void add(BoardBean bean) {
		ListDao.getDao().listInsert(bean);
		System.out.println(bean);
	}

	public int search() {
		System.out.println("ID Number: ");
		int idNum = sc.nextInt();
		int index = ListDao.getDao().getIdNumIndex(idNum);

		if (index == -1) {
			System.out.println("없음");
		} else {
			System.out.println(ListDao.getDao().getIndexBean(index));
		}

		return -1;
	}

	// print
	public void list() {
		Iterator<BoardBean> iter = ListDao.getDao().getList().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	// modify -> 찾는 id값을 입력받고, 그index받아서 삭제하고, 그자리에 그냥 전부 다시 입력받기 그리고 출력하기
	public void modify() {
		System.out.println("수정할 ID 값을 입력해 주세요");
		// 수정할 id값
		int idNum = sc.nextInt();
		// 수정할 인덱스
		int idIndex = ListDao.getDao().getIdNumIndex(idNum);
		if(idIndex == -1) {
			System.out.println("없는id 입니다.");
			return;
		}
		// bean 으로 받아와서 그냥 이걸 set
		ListDao.getDao().listModify(idIndex, inputData());
	}

	public void delete() {
		System.out.println("삭제할 ID 값을 입력해 주세요, 만약 전체 삭제를 원하신다면 -1을 입력해 주세요");
		int idNum = sc.nextInt();

		if (idNum == -1) {
			ListDao.getDao().allDelete();
			list();
			return;
		}

		int index = ListDao.getDao().getIdNumIndex(idNum);

		// list는 private 이므로 ListDao 에 listDelete 메서드를 만들고 호출
		ListDao.getDao().listDelete(index);
		list();

	}

	public void menu() {
		while (true) {
			// 1 -> 추가하기ㅇ
			// 2 -> 출력ㅇ
			// 3 -> 상세정보ㅇ
			// 4 -> 수정 ㅇ
			// 5 -> Delete 전체도 가능ㅇ
			// 6, 7 -> 직렬화와 연결
			System.out.println("1.Add 2.List 3.Info 4.Modify 5.Delete 6.Save 7.Open");

			switch (sc.nextInt()) {

			case 1:
				add(inputData());
				break;
			case 2:
				list();
				break;
			case 3:
				search();
				break;
			case 4:
				modify();
				break;
			case 5:
				delete();
				break;
			case 6:
			case 7:

			}

		}

	}

	public static void main(String[] args) {
		ListEx1 ex = new ListEx1();
		ex.menu();
	}

}
