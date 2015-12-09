package Study.DataStruct.Queue.Circular_Queue;

/**
 * @FileName    : CircularQ.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 8. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Circular Queue
 * 
 *  -- Circular Queue  : �迭�� queue�� ���������� ������ �����δ� ť�� �տ� ������ ������ ���� �������� �ұ��ϰ� queue��
 *  					 �� �̻� ���ο� �ڷḦ ������ �� ���� ������ ����
 *  					 �������� ���ư��� �����ϰ� Circular Queue�� �迭�� ������� �Ѱ� �����ؾ��Ѵ�. �� size + 1 �̸�
 *  					 �� ������� �迭�� ���¸� ���� �����̴�.(����ְų� �� ���ִٴ� ���� Ȯ���ϱ� ����.)
 *  
 *  -- �Ǽ� �Ѱ� : �迭�� size�� �޾ƿ��µ� �̰��� �������� �迭 size�� size + 1 �̱� ������ �򰥸��� �� ���� 
 *  			 �迭�� length�� �̿��ϴ°��� ����. 
 *  
 *  -- �����ϰ� ������� �� : Circular Queue �̱� ������ queue�� remove �ǰ� ���� �ٽ� �����Ҷ� �� ���ִ��� ����ִ����� ���ؼ�
 *  					  �����ؾ� �ȴ�. �迭�� length ��ŭ�� �� �����ؾߵȴ� �� ���� ������ ���� ����
 * 					 	  boolean�� üũ�ϱ� ���� �޼ҵ忡�� or( || ) �����ڸ� �̿� �Ͽ� �ΰ� �̻��� ���ǿ��� �ϳ��� �����ص�
 * 						  true//false �� ��ȯ�ϵ��� �� �� �ִ�.
 *  
 */

/**
 * @FileName    : CircularQ.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 8. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� :
 */

public class CircularQ {
	
	private int size;
	private int front;
	private int rear;
	private long[] queueArray;
	
	public CircularQ(int size) {
		this.size = size+1;
		queueArray = new long[size];
		rear = -1;
		front = 0;
	}
	
	public boolean insert(long item){
		
		if( isFull() ){
			
			System.out.println("stack is full");
			return false;
			
		}else{

			if( rear == queueArray.length - 1){ 
				rear = -1;
			}
			
				queueArray[++rear] = item;
				
				return true;
		}
	}
	
	public boolean remove(long[] item){
		 
		if( isEmpty() ){
			
			System.out.println("stack is empty");
			return false;
			
		}else{
			
			item[0] = queueArray[front++];
			
			if(front == queueArray.length){
				front = 0;
			}
			
			return true;
		}
	}
	
	public boolean peek(long[] item){
		
		if( isEmpty() ){
			System.out.println("stack is empty");
			return false;
		}else{
			
			item[0] = queueArray[front];
			return true;
		}
	}
	
	public int size(){
		
		if( isEmpty() ){
			return 0;
		}else if(rear> front){
			return (rear - front + 1);
		}else{ 
			return ((size - front) + (rear + 1) );
		}
	}
	

	
	private boolean isEmpty() { 
		
		return ((front - 1 == rear) || (front + queueArray.length -1 == rear));
		
	}
	
	private boolean isFull() {
		
		return ((front - 2 == rear) || (front + queueArray.length -2 == rear));
	}
	
	public void display(){
		
		int intVar = 0; 
		
		while((intVar < size-1)){
			
			System.out.println(queueArray[intVar++]);
		}
	}

	
	
	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}
	
	
}


