package Study.DataStruct.Queue;

/**
 * @FileName    : Queue.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 3. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Queue는 FIFO(First In First Out)구조 이다  삽입 insert, 삭제 remove, 읽기 peek 메소드를 갖음
 * 				  insert시  rear 가 증가됨, 삭제시 front 증가 즉, rear는 queue의 끝을 의미하고 front는 queue의 앞을 의미한다.
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
