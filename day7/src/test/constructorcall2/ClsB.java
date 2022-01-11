package test.constructorcall2;

public class ClsB extends ClsA {

	public ClsB() {
//		super();
		System.out.println("ClsB()의 생성자 호출");
	}
	
	public ClsB(int n) {
//		super();
		System.out.println("ClsB(int n)의 생성자 호출 : " + n);
	}
}
