package week_7;

public class Student {
	private String name;
	private String id;
	private String dept;
	private String className;
	
	public Student() {}

	public Student(String name, String id, String dept, String className) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.className = className;
	}
	
	@Override
	public String toString() {
		return String.format("이름: %s, 학번: %s, 학과: %s, 과목: %s", name, id, dept, className);
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
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
}
