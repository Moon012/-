package Study.DataStruct.Serach;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Execute {
	
	public static void main(String[] args){
		
		int[] dsInt = {3,7,11,12,27,49,53,68,72,91};
		
		while(true){
			System.out.println("-------------------");
			System.out.println("Searching Algorithm");
			System.out.println("-------------------");
			System.out.println("1. Linear Search");
			System.out.println("2. Binary Search");
			System.out.println("3. Display List");
			System.out.println("4. Exit");
			
			System.out.println("Enter the number of command >> ");
			int command = getInt();
			int value;
			int i;
			
			switch (command) {
		
			case 1:
				
				System.out.println("Enter the number to search >> ");
				value = getInt();
				LinearSearch.linearSearch(value, dsInt);
				System.out.println();
				
				break;

			case 2:
				
				System.out.println("Enter the number to search >> ");
				value = getInt();
				BinarySearch.binarySearch(value, dsInt);
				System.out.println();
				
				break;
			
			case 3:
				
				for(i = 0; i<dsInt.length; i++){
					System.out.println( dsInt[i]);
				}
					
				break;
				
			case 4:
				
				System.exit(0);
				break;
			default :
				System.out.println("Invlid entry");
			}			
		}
	}

	private static int getInt() {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return (Integer.parseInt(input));
	}

}
