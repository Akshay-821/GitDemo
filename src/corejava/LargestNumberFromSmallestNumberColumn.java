package corejava;

// this program is first find the min number from matrix and then find the largest number from that column
public class LargestNumberFromSmallestNumberColumn {

	public static void main(String[] args) {
		int arr[][] = { { 11, 2, 1 }, { 4, 5, 8 }, { 7, 8, 7 } };
		int min = arr[0][0];
		int mincoloumn = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (arr[i][j] < min) {
					min = arr[i][j];
					mincoloumn = j;
				}
			}
		}
		int max = arr[0][mincoloumn];
		int k = 0;

		while (k < 3) {
			if (arr[k][mincoloumn] > max) {
				max = arr[k][mincoloumn];
			}
			k++;
		}

		System.out.println(max);
	}

}
