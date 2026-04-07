package corejava;

public class LargestNumbrfromMetrices {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 11, 2, 1 }, { 4, 5, 8 }, { 7, 8, 7 } };
		int max = arr[0][0];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}

		System.out.println(max);
	}

}
