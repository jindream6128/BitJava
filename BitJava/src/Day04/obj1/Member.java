package Day04.obj1;

public class Member {
	private String name;
	private String id;
	private String email;
	private int countValue;

	public Member() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCountValue() {
		return countValue;
	}

	public void setCountValue(int countValue) {
		this.countValue = countValue;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", email=" + email + ", countValue=" + countValue + "]";
	}

	// alt shift s - o ?��?��?�� overload
	public Member(String name, String id, String email, int countValue) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.countValue = countValue;
	}

}
