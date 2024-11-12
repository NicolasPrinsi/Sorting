
public class main {
	
	public static void main(String args[]) {
		int a[] = new int[10];
		a[0]=10;
		a[1]=5;
		a[2]=7;
		a[3]=7;
		a[4]=3;
		a[5]=6;
		a[6]=4;
		a[7]=8;
		a[8]=7;
		a[9]=9;
		QuickSort.arrayPrint(a);
		QuickSort.QuickSort(a, 0, a.length-1);
		QuickSort.arrayPrint(a);
	}
}
