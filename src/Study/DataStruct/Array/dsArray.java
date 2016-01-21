package Study.DataStruct.Array;


public class dsArray {
		
	public static void main(String[] args){
		
		String[] dsStr;
		dsStr = new String [100];
		int nItems = 0;
		String searchKey, deleteKey;
		
		dsStr[0] = "Monday";
		dsStr[1] = "Tuesday";
		dsStr[2] = "Wednesday";
		dsStr[3] = "Thursday";
		dsStr[4] = "Friday";
		dsStr[5] = "Saturday";
		dsStr[6] = "Sunday";
		nItems = 7;
		
		for(int i = 0; i<nItems; i ++){
			System.out.println(dsStr[i] + " ");
		}
		
		System.out.println();
		
		searchKey = "Wednesday";
		int i;
		for(i = 0; i<nItems; i++){
			
			if(dsStr[i] == searchKey ){
				break;
			}
		}
		
		if( i == nItems){ //마지막자료인가?
			System.out.println("Can't find " + searchKey); // 그렇다
			
		}
		
		else
		{
			System.out.println("Found " + searchKey);
		}
		
		deleteKey = "Thursday"; 
		
		for(i=0; i<nItems; i++){
			
			if(dsStr[i] == deleteKey){
				break;
			}
			
		}
		
		for(int k = i; k<nItems -1 ; k++){
			dsStr[k] =dsStr[k+1];
			
		}
		nItems--;
		
		for(i =0; i<nItems; i++){
			System.out.println(dsStr[i]+" delete 후 출력");
		}
		
		System.out.println("");
		
	}
}
