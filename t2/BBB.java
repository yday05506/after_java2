package test.t2;

import test.t1.MainTest;

//MainTest와 다른 패키지
public class BBB {
	public void accessTest() {
		MainTest mt = new MainTest();
		
		//다른 패키지에서는 public만 가능
		System.out.println(mt.n1);		//public
//		System.out.println(mt.n2);		//private
//		System.out.println(mt.n3);		//protected
//		System.out.println(mt.n4);		//default
	}
}
