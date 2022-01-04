package test.score;

import java.util.Scanner;

public class DynamicArrayScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stuName = {"인소리", "최자윤", "임채영", "정현진", "이예진"};
		//학생 수
		System.out.print("* 학생 수를 입력해주세요 : ");
		int stuNum = sc.nextInt();
		double avg = 0;
		String name;
		int score = 0;
		int[] sum = new int[stuNum];
		
		int[][] scores = new int[stuNum][];
		
		System.out.println();
		
		//동적 배열의 행(학생 수)에 대한 for문
		for (int i = 0; i < scores.length; i++) {
			System.out.print("* 과목 수를 입력해주세요 : ");
			int subNum = sc.nextInt();
			scores[i] = new int[subNum];
			//동적 배열의 열(과목 수)에 대한 for문
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(j+1+"과목 성적 입력 : ");
				scores[i][j] = sc.nextInt();
				sum[i] += scores[i][j];
			}
			System.out.println();
		}
		
		//출력
		for(int i = 0; i < scores.length; i++) {
			System.out.print(stuName[i] + "\t");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.print("합계 : " + sum[i] + "\t");
			System.out.printf("평균 : %.1f\n", ((double)sum[i] / scores[i].length));
		}
		sc.close();

	}

}
