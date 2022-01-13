package mvc.score.controller;

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.Subject;

import mvc.score.model.Student;
import mvc.score.view.ScoreView;

public class ScoreController {

	public static void main(String[] args) {
		ArrayList<Student> studentArrList = new ArrayList<Student>();
		Scanner s1 = new Scanner(System.in);	//���ڿ� �Է¿�
		Scanner s2 = new Scanner(System.in);	//���� �Է¿�
		
		String[] subjects = {"����", "����", "����", "����", "����"};
		int[] scores = new int[subjects.length];
		
		while(true) {
			System.out.println("�л� ������ �Է����ּ���.");
			System.out.print("���� : ");
			String name = s1.nextLine();
			System.out.print("�й� : ");
			int stuID = s2.nextInt();
			
			System.out.println("�л� ������ �Է����ּ���.");
			for(int i = 0; i < subjects.length; i++) {
				System.out.print(subjects[i] + " : ");
				scores[i] = s2.nextInt();
			}
			
			Student s = new Student(name, stuID, scores[0], scores[1], scores[2], scores[3], scores[4]);
			studentArrList.add(s);
			
			System.out.print("���� �л� ������ ��� �Է��Ͻðڽ��ϱ�?(y/n) : ");
			String contin = s1.nextLine();
			
			if(contin.equals("n") || contin.equals("no"))
				break;
		}
		
		//ȭ�鿡 ����� ����ϱ� ���ؼ� ScoreView ��ü�� �����Ѵ�.
		ScoreView view = new ScoreView(studentArrList);
		view.print();
		
		s1.close();
		s2.close();
	}

}
