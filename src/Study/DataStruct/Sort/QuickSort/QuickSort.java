package Study.DataStruct.Sort.QuickSort;


/**
 * @FileName    : QuickSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 10. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : QuickSort�� 1962�� C.A.R Hoare�� �������. ���� �˰��� �� ���� ����� ��� ���� �ӵ��� ������ �ִ�.(����)
 * 				  �� ������ ���� �˰���(partition algorithm)�� �⺻ �������� �ϰ� �ִ�.
 * 
 * 				** �߰� ��(median of three) ���� ��� - �迭�� ���� ���ʰ��� �߰� �� �� ������ �� ���� ���ϰ� ���� ������ 
 *                 ���� �����Ѵ��� �߰� ���� �������� ���� (���� ���������� ���� ���� ����)
 *                 
 *              �ð� ���⵵ : O(nlogn)    * �־��� ������ �Ǿ� �ִ°�� : O(N^2)
 *    
 *  -- ���� : �� ������ ���Ұ� ��͸� �̿��ؼ� �����Ѵ�. �ؿ� �ּ��� ���� ��������.
 */


public class QuickSort {
	
	public QuickSort(int[] arr, int leftmost, int rightmost) {
		Sort(arr, leftmost, rightmost);
	}

	private void Sort(int[] arr, int leftmost, int rightmost) {
		
		if(rightmost - leftmost <= 0){// �� ����� ���� �� ��, �迭�� ũ�Ⱑ 1 ������ ���(�� ���� ���� 1���� ���) - ��͸� ������ ���� ����
			return;
		}
		
		else{
			
			int pivot = arr[rightmost]; //ù �Ǻ��� ���ؾ� �ϱ� ������ �ϴ� �迭�� �� ������ ������ �Ѵ�.
			int i = leftmost -1 ; // ������ �迭�� ������ �迭�� �� �ϱ� ���� �迭�� ������ -1 ���� �����Ѵ�.
			int j = rightmost; 
			
			while(true){
				
				while(arr[++i] < pivot); // ���� ���� �� �̻� ���� ���ڰ� ���� ������ ����.
				
				while(j > leftmost && arr[--j]> pivot); // ���� ���� �� �̻� ū ���ڰ� ���� ������ ����.
				
				if(i >= j){ //���� �ε����� ������ �ε����� �Ѿ ���� ���� ���� ���� �ʴ� ���
					
					break;
					
				}else{
					swap(arr, i, j);  //���� �ε����� ������ �ε����� ������ �ʾҴµ� �ٲ���� �ϴ� ���, ũ�ν� ���� �ʴ� ��� ġȯ ����� �Ѵ�.
				}
			}
			
			dispalyArray(arr);
			
			swap(arr, i, rightmost); // ã�� ���� �ٲ��ش�.
			
			Sort(arr, leftmost, i - 1 ); // ���� ���� ���� (���)
			
			Sort(arr, leftmost+1, rightmost); // ������ ���� ����(���)
			
		}
		
	}

	private void dispalyArray(int[] arr) {
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
	}

	private void swap(int[] arr, int i, int j) {
			
		int temp; 
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	

}
