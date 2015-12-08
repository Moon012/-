package Study.DataStruct.Queue.Circular_Queue;

/**
 * @FileName    : Excute.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 8. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : CircularQueue의 실행 메소드 
 */


public class Excute {
	
	public static void main(String args[]){
		
		CircularQ queue = new CircularQ(5);
		for(int i = 10; i<15; i++)   {
			queue.insert(i);
		}
		
		System.out.println("");
		System.out.println("display : ");
		queue.display();
		System.out.println("");
		System.out.println(queue.getFront() + " : " + queue.getRear() +  " front rear ");
		
		queue.insert(5);
		System.out.println("");
		queue.display();
		
		
		long[] item = new long[1];
		queue.remove(item);
		System.out.println(item[0]);
		queue.remove(item);
		System.out.println(item[0]);
//		queue.remove(item);
//		System.out.println(item[0]);
//		queue.remove(item);
//		System.out.println(item[0]);
//		queue.remove(item);
//		System.out.println(item[0]);
//		queue.remove(item);
		System.out.println(queue.getFront() + " : " + queue.getRear() +  " front rear ");
		
		System.out.println("");
		
		queue.insert(99);
		queue.insert(77);
		queue.display();
		queue.insert(44);
		
//		queue.display();

		
		
	}

}
