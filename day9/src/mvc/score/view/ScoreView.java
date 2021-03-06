package mvc.score.view;

import java.util.ArrayList;
import mvc.score.model.Student;
//MVC Modeling 중에서 View(보여줌)에 해당하는 클래스
public class ScoreView {
	private ArrayList<Student> studentArrList;
	
	public ScoreView(ArrayList<Student> studentArrList) {
//		super();
		this.studentArrList = studentArrList;
	}
	
	public void print() {
		System.out.println("=============== MVC 모델링을 기반으로 한 성적 프로그램 ===============\n");
		
		for(int i = 0; i < studentArrList.size(); i++) {
			Student s = studentArrList.get(i);
			int sum = calcSum(s);
			double avg = calcAvg(sum);
			System.out.printf("*성명 : %s    학번 : %d    국어 : %d    영어 : %d    수학 : %d    과학 : %d    역사 : %d    합계 : %d    평균 : %.2f\n", s.getName(), s.getStuID(), s.getKor(), s.getEng(), s.getMath(), s.getScience(), s.getHistory(), sum, avg);
		}
	}
	
	public int calcSum(Student s) {
		int sum = s.getKor() + s.getEng() + s.getMath() + s.getScience() + s.getHistory();
		return sum;
	}
	
	public double calcAvg(int sum) {
		double avg = sum / 5.0;
		return avg;
	}
}
