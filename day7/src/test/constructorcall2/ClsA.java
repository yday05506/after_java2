package test.constructorcall2;

public class ClsA {

	public ClsA() {
//		super();
		System.out.println("ClsA()의 생성자 호출");
	}
	
	public ClsA(int n) {
//		super();
		System.out.println("ClsA(int n)의 생성자 호출 : " + n);
	}
}
