package Study.DataStruct.Queue.Linked_List_Queue;

/**
 * @FileName    : QueueList.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 4. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Node�� �̿��� Queue
 * 	
 * -- ���� �ߴ� �� : front�� remove ���� �� ���� Node�� link�� �������µ� �������� ��带 remove�Ҷ� link��
 * 				   null�̱� ������ front�� null�̴�. �׸��� front�� null ������ rear�� ������ �� �ֱ� ������ ��带 
 * 				   ������ �ֱ⶧����  rear�� null �ʱ�ȭ�� �ʿ��ϴ�.
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
