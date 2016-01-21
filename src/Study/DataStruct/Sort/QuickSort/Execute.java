package Study.DataStruct.Sort.QuickSort;

import Study.DataStruct.Sort.InsertionSort.InsertionSort;

public class Execute {

	public static void main(String[] args){
		
//		int[] arr = {5,2,7,3,9,10,22,13,4};
		
		int [] arr = {4,3,2,1}; 
//		
//		int [] arr = {1,2,3,4,5};
		
//		int[] arr2 = arr.clone();
		
		
//		QuickSort qs = new QuickSort(arr, 0, arr.length-1);
		
		QuickSort_Median qsm = new QuickSort_Median(arr, 0, arr.length-1);
		
//		InsertionSort is = new InsertionSort(arr2);
		
//		QuickSort3 q3 = new QuickSort3();
//		q3.quickSort3(arr, 0, arr.length-1);
		
		
	}
	
}
