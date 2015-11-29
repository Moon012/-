package Study.DataStruct.ch1;

import javax.sql.rowset.serial.SerialArray;
public class orArray {
	private long[] dsOrder;
	private int nItems;
	public orArray(int max){
		dsOrder = new long[max];
		nItems = 0 ;
	}
	
	public int OrSize(){
		return nItems;
	}
	
	public int OrFinde(long searchKey){
		
		int LB = 0;
		int UB = nItems -1;
		int current;
		while (true){
			current = (LB + UB)/2;
		
		
			if (dsOrder[current] == searchKey){
				return current;
			}
			
			else if(LB > UB) {
				return nItems;
				
			}
			
			else {
				if(dsOrder[current] < searchKey){
					LB = current + 1;
				}
				else {
					UB = current - 1;
				}
			}
		
		}
	}
	
	public void OrInsert(long value){
		int i ;
		for(i =0; i<nItems; i++){
			if(dsOrder[i] > value){
				break;
			}
		}
		
		for(int k = nItems ; k> i; k--){
			dsOrder[k] = dsOrder[k-1];
		}
		
		dsOrder[i] = value;
		nItems++;
	}
	
	public boolean OrDelete(long value){
		
		int i = OrFinde(value);
		if(i == nItems){
			return false;
		}
		
		else {
			
			for( int k = i; k < nItems; k++){
				dsOrder[k] = dsOrder[k+1];
			}
			 nItems --;
			 return true;
		}
		
	}
	
	public void OrDisplay(){
		for(int i =0; i< nItems; i ++){
			System.out.println(dsOrder[i]  +  " ");
		}
		System.out.println("");
	}

}
