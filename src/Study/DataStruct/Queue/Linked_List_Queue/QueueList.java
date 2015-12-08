package Study.DataStruct.Queue.Linked_List_Queue;

/**
 * @FileName    : QueueList.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 4. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Node를 이용한 Queue
 * 	
 * -- 아차 했던 것 : front를 remove 했을 때 다음 Node의 link를 가져오는데 마지막의 노드를 remove할땐 link가
 * 				   null이기 때문에 front도 null이다. 그리고 front는 null 이지만 rear는 마지막 즉 최근 생성한 노드를 
 * 				   가지고 있기때문에  rear도 null 초기화가 필요하다.
 */

public class QueueList {
	
	private QueueNode front;
	private QueueNode rear;
	
	public QueueList(){
		
		front = null;
		rear = null;
	}
	
	public void insert(long item){
		
		QueueNode newNode = new QueueNode();
		newNode.setQueueItem(item);
		
		if( isEmpty() ){

			rear = newNode;
			front = newNode;
		}else{
			rear.setLink(newNode);
			rear = newNode;
		}
	}
	
	public boolean remove (long[] item){
	
		if( isEmpty() ){
			
			System.out.println("queue is empty");
			return false;
			
		}else{
			
			item[0] = front.getQueueItem();
			front = front.getLink();
			if(front == null ){
				rear = null;
				
			}
			return true;
		}
		
	}
	
	public boolean peek(long item[]){
		
		if( isEmpty() ){
			System.out.println("queue is empty");
			return false;
			
		}else{
			item[0] = front.getQueueItem();
			return true;
		}
	}
	
	private boolean isEmpty() {
		
		return (front == null);
	}

}
