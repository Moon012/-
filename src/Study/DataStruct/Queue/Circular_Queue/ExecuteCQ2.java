package Study.DataStruct.Queue.Circular_Queue;

public class ExecuteCQ2 {

	public static void main(String[] args){
		
		CircularQ2 q2 = new CircularQ2(5);

		for(int i = 0; i<5; i++){
			q2.insert(i);
		}
		
		System.out.println("insert : ");
		q2.display();
		q2.insert(11);
		
		System.out.println("");
		System.out.println("remove : ");
		
		q2.remove();
		q2.remove();
		q2.remove();
		q2.remove();
		q2.remove();
		
		System.out.println("");
		q2.remove(); // isEmpty
		
		System.out.println("");
		
		System.out.println("다지우고 display");
		q2.display();
		
	}
}

