package Day11;

import java.io.Serializable;

public class Member implements Serializable {
	private String id;
	private transient String name; //name은 비밀인데! transient를 붙이면 직렬화해서 내보낼때 name 빼고 내보내짐
	private String height;
	//지금은 바이트나 스트림이 아니라서 깨져있음
	
	
	//생성자
	public Member() {
		super();
	}
	public Member(String id, String name, String height) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
	}
	
	
	//getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", height=" + height + "]";
	}
	
	
}
