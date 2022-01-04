package test.arr1;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		int[] scores = new int[5];
		int sum = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < scores.length; i++) {
			System.out.print(i+1 + "과목 성적 입력 : ");
			scores[i] = s.nextInt();
			sum += scores[i];
		}
		
		System.out.println("총 합계 : " + sum);
		double avg = (double)sum / scores.length;
		System.out.printf("평균 : %.2f\n", avg);	//소수점 둘째 자리까지 출력

		s.close();
	}

}
