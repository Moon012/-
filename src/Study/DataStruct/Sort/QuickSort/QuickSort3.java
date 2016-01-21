package Study.DataStruct.Sort.QuickSort;

public class QuickSort3 {
	
	int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	      
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	            	
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  
	                  i++;
	                  j--;
	            }
	      };
	      
	      dispalyArray(arr);
	     
	      return i;
	}
	 
	void quickSort3(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      manualSort(arr,left,right);
	      
	      if (left < index - 1)
	            quickSort3(arr, left, index - 1);
	      if (index < right)
	            quickSort3(arr, index, right);
	}
	
	private void dispalyArray(int[] arr) {
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
	}
	
	private void manualSort(int[] arr, int leftmost, int rightmost) {
		
		int center = ((rightmost + leftmost)/2);
		
		if((rightmost-leftmost) < 1){
			return;
		}else if((rightmost-leftmost) == 1 && arr[leftmost]> arr[rightmost]){
			swap(arr, leftmost, rightmost);
			return;
		}

		if(arr[leftmost] > arr[rightmost]){
			swap(arr, leftmost, rightmost);
		}
		if(arr[leftmost] > arr[center]){
			swap(arr, leftmost, center);
			
		}
		if (arr[center] > arr[rightmost] ){
			swap(arr, center, rightmost);
			
		}
		
		return;
		
	}
	
	private void swap(int[] arr, int i, int j) {

		int temp; 
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

}
