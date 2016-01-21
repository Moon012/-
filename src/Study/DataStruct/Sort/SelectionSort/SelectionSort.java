package Study.DataStruct.Sort.SelectionSort;

/**
 * @FileName    : SelectionSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : SelectionSort(���� ����)�� ���� ������ �ڸ��ٲ� Ƚ���� �������ν� ������ ������ �˰���.
 * 				  �׷��� ���� ������ �� Ƚ���� ���� ���İ� ����.
 * 				  ���� ������ ù ��°�׸��� �������� �ٸ� �׸���� ���Ͽ� ���� ���� �׸��� ���� �׸�� �ڸ��ٲ�.
 * 
 * 				  �ð� ���⵵ : O(N^2)
 */

public class SelectionSort {
	
	public SelectionSort(int[] arr) {
		
		
		for(int i = 0; i<arr.length; i++){
			
			for(int j = i; j<arr.length; j++){
				
				if(arr[i] > arr[j]){
					
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
			
			displayArray(arr);
			
		}
	}

	private void displayArray(int[] arr) {

		for(int i =0; i< arr.length ; i ++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		
	}

}
