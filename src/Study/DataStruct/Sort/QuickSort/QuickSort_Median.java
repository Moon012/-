package Study.DataStruct.Sort.QuickSort;

/**
 * @FileName    : QuickSort_Median.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 14. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : median-of-three partitioning�� �̿��� quick sort ����
 * 				  ���� ������ quick sort�� pivot�� �� �����ʳ� �� ������ �����ϰ� �ߴ�. ������ �ǹ��� min Ȥ�� max�� ���� �ȴٸ� 
 * 				  worst case ( O(N^2) )�� ���� ��������� �ȴ�. �̸� �����ϱ� ���� ��� �� �߰��� ���ð� ������ �����̴�.
 * 				  (���� �ƴ� �迭�� ��ġ�� ���Ѵ�. �� index)
 * 
 * 				median-of-three partitioning : �־��� �迭�� �� ó�� �� �� �׸��� �߰� ���� ũ�⸦ ���� �ڽ��� �´� ��ġ�� ���� ��Ų��.
 * 											   -- �ٸ� ��ġ�� ���ҵ��� ���� ���� ���� ����
 * 
 * 
 *     ** CUTOFF�� ����� ���
 * -- CUTOFF : CUTOFF�� quick sort���� ������ ��� �̷��� ��ȿ���� �߱��ϴ� ��� ����� �� �ִ�  CUTOFF�� �迭�� �۾����� ũ�⸦ �����ϸ�
 * 			   ������ ������ �ȿ� ������ ���� ������ �ϵ��� �����Ѵ�. 
 * 			  -- ��ǻ���� ���ɿ� ���� �ٸ� �� ������ ���� 5 ~ 15�� ������ ���� ȿ�����̴�. �� ������ ���ڸ� ���� �ϴ� ���� ����.
 * 
 * 	
 * CUTOFF ex)  CUTOFF ����� �����̴�.(�� �ڵ�� ���� �޼ҵ� �ȿ� ù ���忡�� Ȯ���Ѵ�. ��, ���⼱ Sort()�ȿ� ù�ٿ� ���δ�. ����, manualSort �ȿ� �迭 ����� ������ 0 �̰ų� 1��� ���� �� ���� �����ؾ� �Ѵ�.)
 * 
 * 	int CUTOFF = 10;
 *	 
 *	if( leftmost + CUTOFF > rightmost ){
		insertionSort( a, leftmost, rightmost );
		return;
	 } 
 *  
 * 
 */

public class QuickSort_Median {
	
	int count = 0;
	
	public QuickSort_Median(int arr[], int leftmost, int rightmost) {
		
		Sort(arr, leftmost, rightmost);
	}
	
	
	private void Sort(int[] arr, int leftmost, int rightmost) {
		
 		
		
		if(rightmost - leftmost  <= 0){ //�迭�� ����� 0��� ����
			return;
		}
		
		int median = ((leftmost + rightmost)/2); //�߰����� ��ġ�� ����
		
		manualSort(arr, leftmost, rightmost); //three partitioning : ���� ���� �־��� �迭�� �� ó���� �� ���� ���Ͽ� ���� 
		
		
		int pivot = arr[median];
		int i = leftmost+1; // manualSort�� �� ��� �Ǻ��� ���� �̹� �� �Ͽ���. ���� �迭���� �� ó���� ���� �۴�.
		int j = rightmost-1; // manualSort�� �� ��� �Ǻ��� ���� �̹� �� �Ͽ���. ���� �迭���� �� �������� �Ǻ� ���� ũ��.
		
		while(true){
					
			while(arr[i] < pivot) // ���� �Ǻ� ���� ū ���� ��ġ�� ã�´�. 
				i++;
				
			while(j>leftmost && arr[j] > pivot) // j�� �Ǻ� ���� ���� ���� ��ġ�� ã�´�.  
				j--;
				
			if(i >= j){
				break;
			}else{
				swap(arr, i, j); //  ���� while ������ �������� i�� j���� ũ�� ���� ��� swap�� �ʿ��Ѵ�. �� i�� �Ǻ����� ū ���� ��ġ��, j�� �Ǻ����� ���� ���� ��ġ�� ������ �ִ�.
				i++;			 // swap�� �Ͼ �� i,j�� �ٽ� ���� ����� �ƴϹǷ� i�� �ϳ� ���� j�� �ϳ� �����Ѵ�.
				j--;
			}
			
			
		}
		
//		swap(arr, i, median); // �̹� while���� �������� ã�� ���ߴٸ� pivot�� ��ġ�� i���� ��ġ�̸� �´� ��ġ�� �־��� ������ ���� ���� swap�� �� �ʿ䰡 ����. 
		
		dispalyArray(arr);
		
		Sort(arr, leftmost, i-1); // i�� ��ġ�� �� ��(pivot ��)�� ��ġ �̱� ������ �´� ��ġ, �� �׺��� �ϳ� ���� �迭�� ũ��� �޼ҵ带 �����.
			
		Sort(arr, i+1 , rightmost); // i�� ��ġ�� �� ��(pivot ��)�� ��ġ �̱� ������ �´� ��ġ, �� �׺��� �ϳ� ū �迭�� ũ��� �޼ҵ带 �����.
	
	}
	
	

	public void dispalyArray(int[] arr){
		
		for(int var = 0; var<arr.length; var++){
			
			System.out.print(arr[var]+ " " );
			
		}
		System.out.println("");

	}

	
	private void manualSort(int[] arr, int leftmost, int rightmost) {
		
		// CUTOFF�� ����� ��� �迭�� ũ�Ⱑ 0�̰ų� 1�� ��츦 ������ �ʿ䰡 ����. ���������� �̷������ ����
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
