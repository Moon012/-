package Study.DataStruct.Serach;

/**
 * @FileName    : BinarySearch.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 이진 탐색(binary search)은 정렬되어 있는 자료들의 집합에서 특정한 자료를 찾고자 할 때 많이 사용되며
 * 				  매우 빠른 탐색 알고리즘.
 * 				  이진 탐색은 선형 탐색과는 달리 자료를 정렬이라는 방법으로 조직한다. 그렇기 때문에 탐색은 간단하지만, 
 * 				  새로운 레코드의 삽입이나 삭제를 할 때 자료 구조를 깨뜨리지 않아야 하는 어려움이 있다.
 * 				 
 *  			  ** 시간 복잡도 : O(nlog2N)
 * 				  ** 반드시 레코드들의 집합은 정렬이 되었어야한다.
 * 
 * 				  mid 값으로 검색하는게 중점. 값이 일치 하지 않을 mid을 비교 했기 때문에 +1, -1 을 사용해 다시 검색
 * 				  하지 않도록 한다.
 * 				
 */


public class BinarySearch {
	
	public static void binarySearch(int key, int[] arr){
		
		int mid;
		int left = 0;
		int right = arr.length -1;
		
		while (right >= left){
			
			mid = right + left;
			
			if(key == arr[mid]){
				System.out.println(key + " is in ter array with index value : " + mid);
				break;
			}
			
			if(key < arr[mid]){
				
				right = mid - 1;
				
			}else{
				
				left = mid + 1;
			}
		}
	}

}
