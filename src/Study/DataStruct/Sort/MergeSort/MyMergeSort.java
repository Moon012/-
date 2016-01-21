package Study.DataStruct.Sort.MergeSort;

/**
 * @FileName    : MyMergeSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 23. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : merge sort(divide-and-conquer ����� ä��)�� ��ü ���Ҹ� �ϳ��� ������ ������ �� ������ ���Ҹ� �ٽ� �����ϴ� ���� ���.
 *  			  merge sort�� �Ϲ����� ������ ���ڸ�(in-place)������ ���� �ʰ� �ٸ� �޸𸮸� ���� ���� �� ���� ����Ʈ�� �� ����� �����Ѵ�.
				  �׷��� �Է� ũ�� ��ŭ�� �޸𸮰� �ݵ�� �Ҵ�Ǿ��� �־�� ���� ����� ������ �� �ִ�.
				  ��, ���� ��Ʈ�� n���� ��ü�� �ִٸ� O(n)��ŭ�� �߰� ������ �ʿ��� ���̴�
				  
				  ������, ���Ľ� �߰����� ������ ��������ν� ���� ���� ������ ������ ������� ������ �����Ѵٴ� ������ ������.
				  ������ stable�� unstable sorting���� ���� �� �ִµ� stable sorting�̶� ����, ���� �˰����� ���� Ű�� (�ʱ⿡ �־��� ��ó��) 
			       ���� ��������� ��������� ���� ������ �����ϴ� ���� ���Ѵ�.
			       �Ϲ����� unstable sort�� ���� �� ������ ������ �ٲ�����, stable_sort�� �� ���� �����Ƿ� �ʱ��� ��� ������ �����Ͽ� ��ġ�� �ٲ��� �ʴ� ���̴�.
 * 			   		
 *  			 �ð� ���⵵ : O(nlogn)
 *  
 *  			 �������� ȯ�濡�� ������ ������ quick > heap > merge ��
 */


public class MyMergeSort {
	
	private int[] helperArr;
	private int[] originalArr;
	
	public MyMergeSort(int[] arr) {
	
		originalArr = arr;
		helperArr = new int[arr.length];
		
		mergeSort(0,arr.length-1);
		
	}

	private void mergeSort(int low, int high) {
		
		if(low < high){
			
			int middle = (low+high)/2;
			
			mergeSort(low, middle);
			
			mergeSort(middle+1, high);
			
			merge(low, middle, high);
		}
		
	}

	private void merge(int low, int middle, int high) {
		
		// ������ �迭�� ������ ���� �ӽ� �迭�� �����Ѵ�.
		for(int i = low; i <= high; i++){
			helperArr[i] = originalArr[i];
		}
		
		
		int i = low; //���� �� ������
		int j = middle+1; // �� �������� �迭�� ������ �������̴� 2 3 / 1 2 ���� ���� ����̱� ������ ���� �ȴٴ� ���� ��������.  
		int k = low; // ���ĵ� �迭�� ������
		
		
		while(i<=middle && j<=high){
			
			if(helperArr[i] <= helperArr[j]){ // j�� ���� ���� i ������ ũ�ٸ� ���� �迭�� i ���� �־��ش� �� �񱳰����ٴ� �۴ٴ� ��
				
				originalArr[k++] = helperArr[i++];
				
			}else{
				
				originalArr[k++] = helperArr[j++]; //j�� ���� i ������ ���� �� ���� �迭�� k��°�� j�� �ִ´�.
				
			}
			
			
		}
		
		while(i<=middle){ // �񱳰��� �߰��� �� ���ĵǾ� ������ ���� �迭���� i ��° ���ʹ� �� ū���̱� ������ �ڿ� �־��ֵ��� �����.
			
			originalArr[k] = helperArr[i];
			k++;
			i++;
		
		}
		
		display(helperArr);
		display(originalArr);
		System.out.println("");
		
		
	}
	
	
	public void display(int[] arr){

		for(int var = 0; var<arr.length; var++ ){
			  
			  System.out.print(arr[var]+ " ");
			  
		  }
		  System.out.println("");
	  }
		
		
}
