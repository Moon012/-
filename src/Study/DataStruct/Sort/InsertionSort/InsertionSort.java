package Study.DataStruct.Sort.InsertionSort;

/**
 * @FileName    : InsertionSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Insertion Sort(삽입 정렬)은 세 개의 기본 정렬들 중 가장 큰 효율성을 가지는 정렬.
 * 				  일반적으로 퀵 정렬에서는 마지막 단계로 쓰곤 하는데, 삽입 정렬은 이미 어느 정도 정렬된 
 * 				  배열에서 아주 큰 효과를 내기 때문.
 * 				  일반적으로 수행속도 효율 :
 * 					 삽입 정렬 = 2 * 버블정렬 , 삽입 정렬 > 선택정렬 (수행 속도 의미 효율이 좋은 것이 크다고 표기했다.)
 * 				 
 * 				 선택된 값은 임시 저장한 후 이전 값들과 비교를 시작하며 조건에 맞지 않는 값을 뒤로 보내고 
 * 				 맞는 위치에 삽입한다.
 * 				 
 * 				  시간 복잡도 : O(N^2)
 * 
 * -- 아차 한 것 : 삽입 정렬시 삽입할 값을 선정하는 것에 대해서 배열의 0번째를 선택하면 안된다. 
 * 				 불필요한 검색을 하며 이전의 배열과 비교 하기때문에 error가 발생할 수 있다.
 * 				 그러므로 첫번째 배열의 선택은 1번째가 되는 것이다.ㅈ
 * 					
 */


public class InsertionSort {
	
	public InsertionSort(int[] arr) {
		
		for (int i = 1; i< arr.length; i++){
			
			int temp = arr[i];
			int j = i;
			
			while(j>0 && arr[j-1] >= temp){
				
				arr[j] = arr[j-1];
				--j;
			}
			
			arr[j]= temp;
			
			displayArray(arr);
		}
	}

	private void displayArray(int[] arr) {
		
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

}
