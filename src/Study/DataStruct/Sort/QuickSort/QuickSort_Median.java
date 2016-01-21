package Study.DataStruct.Sort.QuickSort;

/**
 * @FileName    : QuickSort_Median.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 14. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : median-of-three partitioning를 이용한 quick sort 구현
 * 				  전에 구현한 quick sort는 pivot을 맨 오른쪽나 맨 왼쪽을 선택하게 했다. 하지만 피벗을 min 혹은 max로 고르게 된다면 
 * 				  worst case ( O(N^2) )로 점점 가까워지게 된다. 이를 방지하기 위한 방법 중 중간값 선택과 랜덤값 선택이다.
 * 				  (값이 아닌 배열의 위치를 말한다. 즉 index)
 * 
 * 				median-of-three partitioning : 주어진 배열의 맨 처음 맨 끝 그리고 중간 값의 크기를 비교해 자신의 맞는 위치에 정렬 시킨다.
 * 											   -- 다른 위치의 원소들은 정리 되지 않은 상태
 * 
 * 
 *     ** CUTOFF의 사용한 경우
 * -- CUTOFF : CUTOFF는 quick sort에서 분할이 계속 이뤄져 비효율을 야기하는 경우 사용할 수 있다  CUTOFF는 배열이 작아지는 크기를 제한하며
 * 			   지정한 사이즈 안에 들어오면 삽입 정렬을 하도록 구현한다. 
 * 			  -- 컴퓨터의 성능에 따라 다를 수 있지만 보통 5 ~ 15의 값에서 비교적 효율적이다. 이 사이의 숫자를 선택 하는 것이 좋다.
 * 
 * 	
 * CUTOFF ex)  CUTOFF 사용의 예제이다.(이 코드는 정렬 메소드 안에 첫 문장에서 확인한다. 즉, 여기선 Sort()안에 첫줄에 쓰인다. 또한, manualSort 안에 배열 사이즈를 측정해 0 이거나 1경우 제한 한 것을 삭제해야 한다.)
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
		
 		
		
		if(rightmost - leftmost  <= 0){ //배열의 사이즈가 0경우 종료
			return;
		}
		
		int median = ((leftmost + rightmost)/2); //중간값의 위치를 구함
		
		manualSort(arr, leftmost, rightmost); //three partitioning : 피폿 값과 주어진 배열의 맨 처음과 맨 끝을 비교하여 정렬 
		
		
		int pivot = arr[median];
		int i = leftmost+1; // manualSort를 한 경우 피봇의 값과 이미 비교 하였다. 지금 배열에서 맨 처음은 보다 작다.
		int j = rightmost-1; // manualSort를 한 경우 피봇의 값과 이미 비교 하였다. 지금 배열에서 맨 마지막은 피봇 보다 크다.
		
		while(true){
					
			while(arr[i] < pivot) // ㅑ는 피봇 보다 큰 값의 위치를 찾는다. 
				i++;
				
			while(j>leftmost && arr[j] > pivot) // j는 피봇 보다 작은 값의 위치를 찾는다.  
				j--;
				
			if(i >= j){
				break;
			}else{
				swap(arr, i, j); //  위의 while 구문을 나왔을때 i가 j보다 크지 않은 경우 swap이 필요한다. 즉 i는 피봇보다 큰 값의 위치를, j는 피봇보다 작은 값의 위치를 가지고 있다.
				i++;			 // swap이 일어난 후 i,j를 다시 비교할 대상이 아니므로 i는 하나 증가 j는 하나 감소한다.
				j--;
			}
			
			
		}
		
//		swap(arr, i, median); // 이미 while문을 나왔을대 찾지 못했다면 pivot의 위치는 i값의 위치이며 맞는 위치에 있었기 때문에 쓸대 없는 swap을 할 필요가 없다. 
		
		dispalyArray(arr);
		
		Sort(arr, leftmost, i-1); // i의 위치는 비교 값(pivot 값)의 위치 이기 때문에 맞는 위치, 즉 그보다 하나 작은 배열의 크기로 메소드를 재실행.
			
		Sort(arr, i+1 , rightmost); // i의 위치는 비교 값(pivot 값)의 위치 이기 때문에 맞는 위치, 즉 그보다 하나 큰 배열의 크기로 메소드를 재실행.
	
	}
	
	

	public void dispalyArray(int[] arr){
		
		for(int var = 0; var<arr.length; var++){
			
			System.out.print(arr[var]+ " " );
			
		}
		System.out.println("");

	}

	
	private void manualSort(int[] arr, int leftmost, int rightmost) {
		
		// CUTOFF를 사용할 경우 배열의 크기가 0이거나 1인 경우를 생각할 필요가 없다. 삽입정렬이 이루어지기 때문
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
