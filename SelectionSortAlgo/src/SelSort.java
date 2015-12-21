
public class SelSort {

	public static void main(String[] args) {
		int temp, minIdx;
		int i;
		int j;
		int[] arr = { 15, 6, 70, 25, 16, 2, 11, 9 };

		for (i=0; i < arr.length - 1 ; i++) {
			minIdx = i;
			for (j = i+1; j < arr.length; j++) {
			//	System.out.println(arr[j]);
				 if (arr[j] < arr[minIdx]) {
					minIdx = j;
				} 

			}
			
			if (minIdx != i) {
				temp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = temp;
			}
			
		}
		
		for(int n =0;n<arr.length;n++){
		System.out.println(arr[n]);	
		}
		
	}

}
