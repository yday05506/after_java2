package test.constructorcall2;

public class ClsC extends ClsB {

	public ClsC() {
//		super();
		System.out.println("ClsC()의 생성자 호출");
	}
	
	public ClsC(int n) {
//		super();
		System.out.println("ClsC(int n)의 생성자 호출 : " + n);
	}
}
