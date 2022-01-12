package test.arraylist;

//ArrayList는 java.util 패키지의 클래스
import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//배열은 제한된 개수의 저장 공간을 사용(배열 객체 생성할 때 개수 정하기 때문)
		//ArrayList는 개수 제한 없이 필요한 만큼 저장 공간을 추가(add)해서 사용할 수 있다.
		//ArrayList는 개수 제한 없이 필요한 만큼 저장 공간을 삭제(remove)해서 사용할 수 있다.
		
		//ArrayList 객체 생성 : GenericType(저장될 요소의 자료형 설정)
		ArrayList<String> arrList = new ArrayList<String>();
		//arrList에 데이터를 추가한다.
		arrList.add("손수호");
		arrList.add("박성영");
		arrList.add("홍범기");
		arrList.add("방성준");
		arrList.add("신경선");
		arrList.add("신용우");
		arrList.add("홍승효");
		arrList.add("조경아");
		arrList.add("이우연");
		arrList.add("최인섭");
		
		arrList.remove(7);
		arrList.remove("신용우");
		arrList.add("강수진");

		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}
}
