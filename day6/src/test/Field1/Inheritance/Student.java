package test.Inheritance;

public class Student extends Person {

	int StuID;	//학번
	int grade;	//학년
	int ban;	//반
	
	public void study() {
		System.out.println("공부한다.");
	}
	
	public void play() {
		System.out.println("논다.");
	}
	
}
