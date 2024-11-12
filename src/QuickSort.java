
public class QuickSort {

	
	private static void swap(int arr[], int i, int j) {
		
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	private static int partition (int arr[], int low, int high) {
		
		int piv = arr[high];
		
		int i=low-1;
		
		for (int j=low;j<high;j++) {
			if(arr[j]<piv) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1,high);
		return i+1;
	}
	
	public static void QuickSort(int arr[], int low, int high) {
		
		if(low<high) {
			int pi = partition(arr, low, high);
			
			QuickSort(arr, low, pi-1);
			QuickSort(arr, pi+1, high);
		}
	}
	
	public static void arrayPrint(int arr[]) {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("hold the line");
	}
}
