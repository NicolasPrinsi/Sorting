
public class MergeSort {
	
	private  static void merge(int arr[], int ini,int mid, int fin) {
		
		//tamaño de subArreglos
		int p1= mid + 1 - ini;
		int p2= fin - mid;
		//Subarreglos
		int PI[] = new int[p1];
		int PD[] = new int[p2];
		//Rellenado de subarreglos
		for (int i = 0; i<PI.length;i++) {
			PI[i] = arr[ini+i];
		}
		for(int j = 0; j<PD.length;j++) {
			PD[j] = arr[mid+1+j];
		}
		
		//indice para subarreglos
		int i=0;
		int j=0;
		
		//indice inicial de la fusion
		int k=ini;
		while(i<p1 && j<p2) {
			if(PI[i]<=PD[j]) {
				arr[k]=PI[i];
				i++;
			}else {
				arr[k]=PD[j];
				j++;
			}
			System.out.println(arr[k]);
			k++;
		}
		//copiar elementos restantes de la parte izquierda en caso de ser mas grande
		while(i<p1) {
			arr[k]=PI[i];
			System.out.println(arr[k]);
			i++;
			k++;
		}
		//copiar elementos restantes de la parte derecha en caso de ser mas grande
		while(i<p2) {
			arr[k]=PD[j];
			System.out.println(arr[k]);
			j++;
			k++;
		}
		
		System.out.println("---");
	}
	
	public static void sort(int arr[],int i, int f) {
		if (i<f) {
			int m =i + (f-i)/2;
			
			sort(arr,i,m);
			sort(arr,m+1,f);
			
			merge(arr,i,m,f);
		}
	}
}
