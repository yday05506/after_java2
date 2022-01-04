package test.arr1;

public class DynamicArrTest {

	public static void main(String[] args) {
//		int[][] nums = {{10}, {20, 30}, {40, 50, 60}};
		int[][] nums = new int[3][];
		int cnt = 1;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = new int[i++];
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = cnt++ * 10;
			}
		}
		
		for(int i = 0; i < nums.length; i++)  {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
