package Study.DataStruct.Sort.QuickSort;


/**
 * @FileName    : QuickSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 10. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : QuickSort는 1962년 C.A.R Hoare가 만들었다. 정렬 알고리즘 중 가장 우수한 평균 수행 속도를 가지고 있다.(현재)
 * 				  퀵 정렬은 분할 알고리즘(partition algorithm)을 기본 개념으로 하고 있다.
 * 				  -- 분할 정복법(Divide and Conquer) 같은 표현
 * 
 * 				** 중간 값(median of three) 선택 방식 - 배열의 가장 왼쪽값과 중간 값 맨 오른쪽 값 먼저 구하고 구한 값들을 
 *                 먼저 정렬한다음 중간 값을 피폿으로 선택 (여기 예제에서는 적용 하지 않음)
 *                 
 *              시간 복잡도 : O(nlogn)    * 최악은 정렬이 되어 있는경우 : O(N^2)
 *    
 *  -- 이해 : 퀵 정렬은 분할과 재귀를 이용해서 정렬한다. 밑에 주석을 보고 이해하자.
 */


public class QuickSort {
	
	int count = 0;

	public QuickSort(int[] arr, int leftmost, int rightmost) {
		String str = "first";
		Sort(arr, leftmost, rightmost, str);
	}

	private void Sort(int[] arr, int leftmost, int rightmost,String str) {
		
		
		
		if(rightmost - leftmost <= 0){// 비교 대상이 없을 때 즉, 배열의 크기가 1 이하인 경우(비교 원소 값이 1개인 경우) - 재귀를 나가기 위한 조건
			return;
		}
		
		else{
			
			
			
			int pivot = arr[rightmost]; //첫 피봇을 정해야 하기 때문에 일단 배열의 맨 마지막 값으로 한다.
			int i = leftmost -1 ; // 다음을 배열을 오른쪽 배열과 비교 하기 위해 배열의 시작을 -1 부터 시작한다.
			int j = rightmost; 
			
			while(true){
				
				while(arr[++i] < pivot); // 피폿 보다 작은 숫자를 찾는다.
				
				while(j > leftmost && arr[--j]> pivot); // 피봇보다 큰 숫자를 찾는다
				
				
				if(i >= j){ //왼쪽 인덱스와 오른쪽 인덱스가 넘어가 비교할 값이 존재 하지 않는 경우
					
					break;
					
				}else{
					swap(arr, i, j);  //왼쪽 인덱스와 오른쪽 인덱스가 만나지 않았는데 바꿔줘야 하는 경우, 크로스 되지 않는 경우 치환 해줘야 한다.
				}
			}
			
			
			swap(arr, i, rightmost); 
			/* pivot이  i번째 값 보다 작은 경우 바꾼다. 
			 * pivot == rightmost가 비교 배열(나눠진) 안에서 i번째 배열의 값 보다 작은 경우가 된다.
			 */
			
			dispalyArray(arr);
			
			if(leftmost < i-1){
				Sort(arr, leftmost, i - 1,"left"); // 왼쪽 분할 정렬 (재귀)
			}
			if(i < rightmost){
				Sort(arr, leftmost+1, rightmost,"right"); // 오른쪽 분할 정렬(재귀)
			}
			
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
