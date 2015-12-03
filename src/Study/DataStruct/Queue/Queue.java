package Study.DataStruct.Queue;

/**
 * @FileName    : Queue.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 3. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Queue�� FIFO(First In First Out)���� �̴�  ���� insert, ���� remove, �б� peek �޼ҵ带 ����
 * 				  insert��  rear �� ������, ������ front ���� ��, rear�� queue�� ���� �ǹ��ϰ� front�� queue�� ���� �ǹ��Ѵ�.
 */

public class Queue {
	
	private int size;
	private long[] queueArray;
	private int front;
	private int rear;
	
	public Queue(int size) {
		
		this.size = size;
		queueArray = new long[size];
		front = 0;
		rear = -1;
	}
	
	public boolean insert(long item){
		
		if( isFull() ){
			
			System.out.println("queue is full");
			return false;
						
		}else{
			
			queueArray[++rear] = item;
			return true;
			
		}
	}
	
	public boolean remove(long[] item){
		
		if( isEmpty() ){
			
			System.out.println("queue is empty");
			return false;
			
		}else{

			item[0] = queueArray[front++];
			return true;
			
		}
	}
	
	public boolean peek(long item[]){
		
		if( isEmpty() ){
			
			System.out.println("queue is empty");
			return false;
			
		}else{
			
			item[0] = queueArray[front];
			return true;
		}
	}

	private boolean isFull() {
	
		return (front == size - 1);
	}

	private boolean isEmpty() {
		
		return (front == rear + 1);
	}
}
