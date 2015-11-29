package Study.DataStruct.ch1;

public class Orderred {

	public static void main(String[] args) {
		
		int maxItems = 15;
		
		int[] dsUnOrderred = {42, 92, 26, 11, 19,78, 21, 69,23};
		System.out.println("Not Yet Orderred : ");
		
		for (int i = 0; i< dsUnOrderred.length; i++){
			
			System.out.println(dsUnOrderred[i] );
			
		}
		System.out.println("");
		
		orArray dsOrederred = new orArray(maxItems);
		
		dsOrederred.OrInsert(42);
		dsOrederred.OrInsert(92);
		dsOrederred.OrInsert(26);
		dsOrederred.OrInsert(11);
		dsOrederred.OrInsert(19);
		dsOrederred.OrInsert(21);
		dsOrederred.OrInsert(69);
		dsOrederred.OrInsert(23);
		
		System.out.println("Orderred: ");
		dsOrederred.OrDisplay();
		
		System.out.println("");
		
		int searchKey = 29;
		
		if(dsOrederred.OrFinde(searchKey) != dsOrederred.OrSize()){
			System.out.println("Found " + searchKey);
		} 
		
		else {
			System.out.println("Can't find " + searchKey);
		}
		
		int searchKey1 = 23;
		
		if(dsOrederred.OrFinde(searchKey1) != dsOrederred.OrSize()){
			System.out.println("Found " + searchKey1);
		} 
		
		else {
			System.out.println("Can't find " + searchKey1);
		}
		
		System.out.println("");
		System.out.println("Originally the  dsOrderred : ");
		dsOrederred.OrDisplay();
		
		dsOrederred.OrDelete(69);
		
		System.out.println("");
		System.out.println("After deleteing the dsOrderred : ");
		dsOrederred.OrDisplay();
	
	}

}
