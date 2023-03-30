//Arraylist 메뉴판 예제
package ListDao_Day09;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

//private int no;
//private String title;
//private String writer;
//private String contents;
//private String password;
//private String regdate;

/*1. 시험준비하기
2. ArrayList CRUD 구현 Structure 확인하고 다시 백지로 구현해보기

---------
바꾸는 값 인덱스 받아오기
데이터 add하면 bean이 안고잇는거
input하는거 따로 메서드 분리하기
그리고 add 하고 -> set하는 메서드 불러오기


inputData -> 를 통해서 데이터를 받아서 bean에 저장하고  bean을 리턴한다.
add -> inputData 는 bean을 리턴하니까 bean을 해당 인덱스에 넣어준다.
modify -> inputData객체를 받고,  return 값은 bean이므로 bean 에서 해당인덱슬 modify한다. */

public class ListEx1 {

	private Scanner sc = new Scanner(System.in);
	private ArrayList list;
	
	public void inputData() {
		BoardBean bean = new BoardBean();

		// 예외처리 하기 -> 만약 no이 int 가 아니라면 다시 입력받기
		int no = 0;
		do {
			System.out.println("No를 입력하세요"); // no는 숫자인데, 만약에 문자열을 입력하면 Exception, 만약에 중복이라면 다시 입력하기
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
		
		//여기가 add임 
		ListDao.getDao().listInsert(bean);
		System.out.println(bean);

	}
	
	public void add() {
//		ListDao.getDao().listInsert();
	}

	
	
	public int search() {
		System.out.println("ID Number: ");
		int idNum = sc.nextInt();
		int index = ListDao.getDao().getIdNumIndex(idNum);
		
		if(index == -1) {System.out.println("없음");}
		else {
			System.out.println(ListDao.getDao().getIndexBean(index));
		}
			
		return -1;
	}
	
	public void list() {
		Iterator<BoardBean> iter = ListDao.getDao().getList().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	
	//modify -> 찾는 id값을 입력받고, 그index받아서 삭제하고, 그자리에 그냥 전부 다시 입력받기 그리고 출력하기 
	public void modify() {
		System.out.println("수정할 ID 값을 입력해 주세요");

		//bean 으로 받아와서 그냥 이걸 set
		
	}
	
	public void delete() {
		System.out.println("삭제할 ID 값을 입력해 주세요");
		int idNum = sc.nextInt();
		int index = ListDao.getDao().getIdNumIndex(idNum);
		
		//list는 private 이므로 ListDao 에 listDelete 메서드를 만들고 호출
		ListDao.getDao().listDelete(index);
		list();

	}
	
	
	public void menu() {
		while (true) {
			// 1 -> 추가하기
			// 2 -> 출력
			// 3 -> 상세정보
			// 4 -> 수정
			// 5 -> Delete 전체도 가능
			// 6, 7 -> 직렬화와 연결
			System.out.println("1.Add 2.List 3.Info 4.Modify 5.Delete 6.Save 7.Open");

			switch (sc.nextInt()) {
			
			case 1:
				inputData();
				add();
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
