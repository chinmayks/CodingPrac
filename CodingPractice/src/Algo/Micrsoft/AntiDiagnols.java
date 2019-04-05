package Algo.Micrsoft;

public class AntiDiagnols {

	public static void main(String[] args) {
		/**
		 * [1 2 3
		 * 4 5 6
		 * 7 8 9]
		 * 
		 * output
		 * [1
		 * 2 4
		 * 3 5 7
		 * 6 8
		 * 9
		 */
		
		int [][] arr = new int[][]{{1,2,3},
									{4,5,6},
									{7,8,9}};
		
		for(int i = 0; i<=arr[0].length/2; i++) {
			int col = i+1;
			int row = 0;
			while(col > 0) {
				System.out.print(arr[row++][col--]);
			}
		}
		

	}

}
