package Study.DataStruct.Serach;

/**
 * @FileName    : LinearSearch.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : LinearSearch는 선형탐색(= 순차탐색 : squential search), 단순 키값을 순차적으로 비교
 * 
 * 				  시간 복잡도 : O(N)
 * 
 *  			  적용을 고려해 볼만 한 경우 : 자료 수가 적은경우
 *  									 탐색이 자주 일어 나지 않는 경우(예, 저장장치가 테이프인 경우)	
 *  									 특정 패턴을 탐색해야 할 경우(예, UNIX의 grep(Generalized Regular ExPression) 명령어)	
 *  
 *  
 *  -- 실제로 데이터베이스 같은 프로그램에서 자료를 탐색할 때에는 특정한 키들만 반복적으로 탐색되는 경우가 많음.
 *     즉, 배열에 저장되어 있는 모든 키에 대해서 탐색할 활률은이 전부 동등하지 않다는 것. 그렇기 때문에 탐색이되어 지는 
 *     키값의 빈도수에 따라 배열의 첫 번째 자리부터 차례대로 가장 자주 탐색되어 지는 레코드부터 저장해놓는 방벅으로 순차 탐색을 
 *     개선할 수 있다. 즉 탐색 빈도에 의해서 배열에서의 위치를 정하는것. 하지만 이와 같은 방법은 그 빈도수를 산출해 낼 수 있는 
 *     시간이 필요. 또한 그정보가 정확하다는 보장도 없다. 그래서 보통 데이터베이스에서는 탐색에서 찾은 레코드를 배열에 찾은
 *     레코드를 배열의 가장 첫 번째 배열로 자리르 옮기는 방법을 많이 사용한다. 순차 탐색의 이러한 개선 방법을
 *     자기조직화(self organization)라고 한다.
 *  						
 */	

public class LinearSearch {

	public static void linearSearch(int key, int arr[]){
		
		int i = 0;
		
		while(i < arr.length) {
			
			if(arr[i] == key){
				System.out.println(arr[i] + " : "+ i + "번째");
				break;
			}
			
			i++;
		}
	}
	
}
