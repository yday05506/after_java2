package test.Final1;

public class Parent {
	//final 필드는 초기화 된 값만 사용할 수 있고 변경이 불가능하다. (필드 값 변경 금지)
	public static final int REST_Time = 10;
	
	public final void rest() {
//		restTime = 20;
		System.out.println(REST_Time + "분 휴식한다.");
	}
}
