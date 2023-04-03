package ListDao_Day09;

import java.io.Serializable;

public class BoardBean implements Serializable{
	private int no;
	private String title;
	private String writer;
	private String contents;
	private String password;
	private String regdate;
	

	public BoardBean() {
		super();
	}

	public BoardBean(int no) {
		super();
		this.no = no;
	}
	
	//여기서 중복확인을 어캐하지?
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "BoardBean [no=" + no + ", title=" + title + ", writer=" + writer + ", contents=" + contents
				+ ", password=" + password + ", regdate=" + regdate + "]";
	}

}
