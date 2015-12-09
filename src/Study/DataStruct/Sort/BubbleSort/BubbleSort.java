package Study.DataStruct.Sort.BubbleSort;

/**
 * @FileName    : BubbleSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Bubble Sort�� ���� �⺻���� ���Ĺ�����μ� ���� ������ �ڷ���� ���� �ڸ� �ٲ��ϸ鼭 �ڿ������� ���ĵȴ�.
 * 				  �ڸ� ��ȯ�� �ӽ� ������ ���� �ϳ��� �ʿ�
 * 				  
 * 				  �ð� ���⵵ : O(N^2)
 */

public class BubbleSort {
	
	
	public BubbleSort(int[] arr) {
		
		for(int i = arr.length-1; i>0; i--){
			
			for(int j = 0; j<i; j++){
				
				if(arr[j] > arr[j+1]){
					int temp  = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
			}
			
			displayArray(arr);
		}
		
	}

	private void displayArray(int[] arr) {
		
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
		
	}

}
