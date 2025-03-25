package week_3;

public class Student extends Person implements PrintInterface {
	private String stdId;
	private String jeongong;
	
	public Student(String name, String addr, String phone, String stdId, String jeongong) {
		super(name, addr, phone);
		this.stdId = stdId;
		this.jeongong = jeongong;
	}
	
	public String getStdId() {
		return stdId;
	}
	
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	
	public String getJeongong() {
		return jeongong;
	}
	
	public void setJeongong(String jeongong) {
		this.jeongong = jeongong;
	}
	
	
	@Override
	public void print() {
		System.out.println("이름: " + name);
		System.out.println("주소: " + addr);
		System.out.println("전화번호: " + phone);
		System.out.println("학번: " + stdId);
		System.out.println("전공: " + jeongong);
	}
}
