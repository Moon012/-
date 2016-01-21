package Study.DataStruct.Array;

public class NoDuplicateArray {

	public static void main(String[] args){
		
		int dsInt[];
		dsInt = new int[100];
		int i ;
		int searchKey;
		int deleteKey;
		int insertKey;
		int nItems = 16;
		
		for(int j = 0; j < nItems; j++){
			dsInt[j]= (int) (Math.random()*100);
		}
		
		for(i = 0; i< nItems; i++){
			
			System.out.println(dsInt[i]);
		}
		
		searchKey = 72;
		insertKey = 86;
		deleteKey = 3;
		
		for(i = 0; i< nItems; i++){
			
			if(dsInt[i] == searchKey){
				System.out.println((i+1) + "번째 찾음");
			}
		}
		
		System.out.println( " " );
		System.out.println( " " );

		System.out.println( "2 배열값 삽입 " );
		
		{
			dsInt[nItems] = insertKey;
			nItems++;
				System.out.println((nItems) + "번째에 삽입");
		}
		
		System.out.println(" " );
		System.out.println("삽입된 값 출력");
		
		for(i = 0; i<nItems; i++){
			System.out.println(dsInt[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("3 삭제");
		
		for(i = 0; i<nItems; i++){
			
			if(dsInt[i] == deleteKey){
				for(int k = i; k<nItems-1; k++){
					dsInt[k] = dsInt[k + 1];
					
				}
				
				nItems -- ;
				break;
			}
			
		}
		
		System.out.println(" ");
		System.out.println(" 삭제된 결과 출력");
		
		for(i = 0; i<nItems; i++){
			System.out.println(dsInt[i] + " ");
		}
	}
	
}
