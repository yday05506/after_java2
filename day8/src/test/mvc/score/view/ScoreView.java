package mvc.score.view;

import java.util.ArrayList;
import mvc.score.model.Student;

public class ScoreView {
	private ArrayList<Student> studentArrList;
	
	public ScoreView(ArrayList<Student> studentArrList) {
//		super();
		this.studentArrList = studentArrList;
	}
	
	public void print() {
		System.out.println("=============== MVC �𵨸��� ������� �� ���� ���α׷� ===============\n");
		
		for(int i = 0; i < studentArrList.size(); i++) {
			Student s = studentArrList.get(i);
			System.out.printf("*���� : %s    �й� : %d    ���� : %d    ���� : %d    ���� : %d    \n");
		}
	}
}
