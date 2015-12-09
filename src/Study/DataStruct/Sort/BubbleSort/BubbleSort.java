package Study.DataStruct.Sort.BubbleSort;

/**
 * @FileName    : BubbleSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Bubble Sort는 가장 기본적인 정렬방법으로서 서로 인접한 자료들을 서로 자리 바꿈하면서 뒤에서부터 정렬된다.
 * 				  자리 교환시 임시 저장할 변수 하나가 필요
 * 				  
 * 				  시간 복잡도 : O(N^2)
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
