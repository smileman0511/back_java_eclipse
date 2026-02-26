package objectTest;

import java.util.Objects;

public class User {
//	클래스를 만들면 반드시 해야하는 5가지.
	private Long id;
	private String name;

	public User() {
		;
	}

	public User(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
//	equals를 재정의
//	Long id 필드를 비교하자!
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 같은 객체인지 비교
			return true; // 주소가 같으면 true
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 같은 클래스인지 비교
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id); // id끼리 비교
	}

}
