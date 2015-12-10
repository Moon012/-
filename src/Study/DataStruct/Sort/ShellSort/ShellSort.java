package Study.DataStruct.Sort.ShellSort;

/**
 * @FileName    : ShellSort.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 10. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : ShellSort(쉘 정렬)은 컴퓨터 과학자 Donald L. Shell 의 이름을 따서 만든 정렬 방식.
 * 				  쉘 정렬은 삽입 정렬 알고리즘을 활용하여 삽입 정렬의 단점인 잦은 자료들의 복사 횟수와 저장위치의 빈번한 변경을
 * 				  줄임으로써 정렬시간을 단축 시킨다.
 * 
 * 				  -- 크누스(Knuth)간격 : 3 * h + 1
 * 				  최초의 크누스 간격을 계산했을 때 배열의 lenth 보다 커야 한다. 
 * 					ex)배열 1000 > (364 * 3 +1)  즉, 최초의 크누스 간격(h)는 364가 된다.
 * 				 
 * 				  시간 복잡도 : O(N^3/2) == O(N^1.5)   - 일반적인 시간 복잡도이다. (상황에 따라 변경 될 수 있음.)
 * 
 *  -- 내가 이해 한 것 : 크누스 간격 만큼 배열을 나눈다 즉, 쉽게 이해하기 위해 덩어리를 만든다 생각하자 이러한 덩어리들을 
 * 					 다 비교하는 것이 아니라 첫 간격 배열과 뒷에 간격배열끼리 삽입정렬한다. (배열이 10인 예제 : {4,3,2,1} 비교 {9,8,7,6}  {5,10} : 비교  제외 대상 )
 * 					 즉, 크누스 간격을 기준이로 삽입 정렬의 하는데 배열의 크기가 10이기 때문에 크누스 간격은 4이다
 * 					 배열에 4번째인 9와 배열의 0번째인 0과 비교 한다. 배열의 인덱스를 옴기면서 비교한다. 
 * 					 크누스의 간격을 줄여가며 삽입 정렬을 한다.
 * 
 *  -- 1000개의 배열을 크누스간격으로 할 때 : 364-sort -> 121-sort -> 40-sot -> 13-sort -> 4-sort -> 1-sort
 */


public class ShellSort {

	public ShellSort(int[] arr) {
		
		int h = 1;
		
		while(h <= arr.length/3){
			
			h= h*3 +1;
			
//			system.out.println(h + " : " + arr.length/3);
			
		}
		
		while( h> 0){
			
			System.out.println(" h 값 : "+ h );
			
			for(int i = h; i < arr.length; i++){

				int temp = arr[i];
				int j = i;
				
				while(j>h-1 && arr[j-h] >= temp){
					
					arr[j] = arr[j-h];
					j -= h;
				}
				
				arr[j] = temp;
				
				displayArray(arr);
				System.out.println("");
			}
			
			h = (h-1)/3;
			
		}
	}

	public void displayArray(int[] arr) {
		
		for(int i =0; i<arr.length; i++){
			
			System.out.print(arr[i] + " ");
		}
		
	}

}
