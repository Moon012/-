package Study.DataStruct.Queue.ProrityQueue;
 
/**
 * @FileName    : Excute.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : PriorityQueue는 우선순위 삽입, 삭제
 * 
 */


public class Execute {
	
	public static void main(String[] args){
		
		PriorityQ priorityq = new PriorityQ(5);
		
		priorityq.insert(50);
		priorityq.insert(30);
		priorityq.insert(10);
		priorityq.insert(40);
		priorityq.insert(25);
		
		priorityq.display();
		System.out.println("full : ");
		priorityq.insert(4);
		System.out.println("");
		
		priorityq.remove();
		priorityq.remove();
		priorityq.remove();
		priorityq.remove();
		priorityq.remove();
		System.out.println("empty : ");
		priorityq.remove();
		
		
		
	}
}
