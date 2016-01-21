package Study.DataStruct.Sort.MergeSort;

/**
 * @FileName    : MyMergeSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 23. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : merge sort(divide-and-conquer 방식을 채용)는 전체 원소를 하나의 단위로 분할한 후 분할한 원소를 다시 병합하는 정렬 방식.
 *  			  merge sort의 일반적인 구현은 제자리(in-place)정렬을 하지 않고 다른 메모리를 빌어 정렬 후 원래 리스트에 그 결과를 저장한다.
				  그래서 입력 크기 만큼의 메모리가 반드시 할당되어져 있어야 정렬 결과를 저장할 수 있다.
				  즉, 머지 소트는 n개의 개체가 있다면 O(n)만큼의 추가 공간이 필요한 것이다
				  
				  하지만, 정렬시 추가적인 공간을 사용함으로써 같은 값을 가지는 원소의 상대적인 순서를 유지한다는 장점을 가진다.
				  정렬을 stable과 unstable sorting으로 나눌 수 있는데 stable sorting이라 함은, 정렬 알고리즘이 같은 키가 (초기에 주어진 것처럼) 
			       정렬 결과에서도 상대적으로 같은 순서를 유지하는 것을 말한다.
			       일반적인 unstable sort의 경우는 두 원소의 순서가 바뀌지만, stable_sort는 비교 값이 같으므로 초기의 상대 순서를 유지하여 위치가 바뀌지 않는 것이다.
 * 			   		
 *  			 시간 복잡도 : O(nlogn)
 *  
 *  			 보편적인 환경에서 성능의 우위는 quick > heap > merge 순
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
		
		// 나눠진 배열을 정렬을 위해 임시 배열에 저장한다.
		for(int i = low; i <= high; i++){
			helperArr[i] = originalArr[i];
		}
		
		
		int i = low; //비교할 값 시작점
		int j = middle+1; // 잘 이해하자 배열의 정렬은 나눈것이다 2 3 / 1 2 분할 정복 방식이기 때문에 분할 된다는 것을 생각하자.  
		int k = low; // 정렬된 배열의 시작점
		
		
		while(i<=middle && j<=high){
			
			if(helperArr[i] <= helperArr[j]){ // j의 값이 앞의 i 값보다 크다면 원래 배열에 i 값을 넣어준다 즉 비교값보다는 작다는 것
				
				originalArr[k++] = helperArr[i++];
				
			}else{
				
				originalArr[k++] = helperArr[j++]; //j의 값이 i 값보다 작은 것 원래 배열의 k번째에 j를 넣는다.
				
			}
			
			
		}
		
		while(i<=middle){ // 비교값이 중간에 다 정렬되어 들어갔으나 앞의 배열에서 i 번째 부터는 더 큰값이기 때문에 뒤에 넣어주도록 만든다.
			
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
