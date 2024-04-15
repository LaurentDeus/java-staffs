import java.util.Arrays;

class GuessGame {

	private static int[] sortArray(int[] arr) {

		int arr_len = arr.length;

		for (int j = 0; j < arr_len - 1; j++) {

			for (int i = 1; i < arr_len - j; i++) {

				if (arr[i] > arr[i - 1]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}

			}
		}
		return arr;

	}

	public static void main(String[] args) {

		int[] age = { 23, 12, 25, 2, 155 };
		System.out.println("Before Sorted: " + Arrays.toString(age));

		System.out.println("After Sorted: " + Arrays.toString(sortArray(age)));
		System.out.println("Original Array: " + Arrays.toString(age));
	}
}
