package Study.DataStruct.Sort.SelectionSort;

/**
 * @FileName    : SelectionSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : SelectionSort(선택 정렬)은 버블 정렬의 자리바꿈 횟수를 줄임으로써 성능을 개선한 알고리즘.
 * 				  그러나 선택 정렬의 비교 횟수는 버블 정렬과 같다.
 * 				  선택 정렬은 첫 번째항목을 기준으로 다른 항목들을 비교하여 가장 작은 항목을 기준 항목과 자리바꿈.
 * 
 * 				  시간 복잡도 : O(N^2)
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
