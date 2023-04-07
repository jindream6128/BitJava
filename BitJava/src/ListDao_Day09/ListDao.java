package ListDao_Day09;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//Dao -> DataBase Access Object  데이터 베이스 접근 객체 

public class ListDao{
	private static ArrayList<BoardBean> list = new ArrayList<BoardBean>();
	private static ListDao dao;

	//싱글톤 패턴 -> 만약에 객체가 없으면 만들어주고 객체가 있으면 안만든다.
	public static ListDao getDao() {
		if (dao == null) {
			dao = new ListDao();
		}
		return dao;
	}
	
	//ArrayList 반환하기 private이므로 외부에서 접근이 가능하도록 
	public static void setList(ArrayList<BoardBean> list) {
		ListDao.list = list;
	}

	//id값을 입력받고, 해당값의 인덱스를 반환하고, 그값이 없으면 -1을 반환한다
	public int getIdNumIndex(int idNum){
		for(int i= 0; i<getList().size();i++) {
			if(getList().get(i).getNo() == idNum) return i;
		}
		return -1;
	}
	
	//만약 -1 이 아니면 index를 반환 한다.
	public BoardBean getIndexBean(int index) {
		return getList().get(index);
	}
	
	public void listDelete(int index) {
		getList().remove(index);
		System.out.println("삭제완료");
	}
	
	public void allDelete() {
		getList().clear();
		System.out.println("전체 삭제");
	}
	
	public void listInsert(BoardBean bean) {
		getList().add(bean);
		System.out.println("Insert Success");
	}
	
	public void listModify(int num,BoardBean bean) {
		getList().set(num, bean);
		System.out.println("modify Success");
	}
	
	public static List<BoardBean>getList(){
		return list;
	}

	// 만약 Arraylist에 있으면 false
	public boolean noCheck(int no) {
		if (getList().isEmpty())
			return true; // early return good
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i).getNo() == no) return false;
		}
		return true;
	}
}
