package Study.DataStruct.Queue.Circular_Queue;

/**
 * @FileName    : CircularQ.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 8. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Circular Queue
 * 
 *  -- Circular Queue  : 배열로 queue를 구현했을때 단점은 실제로는 큐의 앞에 가용한 공간이 남아 있음에도 불구하고 queue에
 *  					 더 이상 새로운 자료를 삽입할 수 없는 단점을 보완
 *  					 원형으로 돌아간다 생각하고 Circular Queue는 배열에 빈공간이 한개 존재해야한다. 즉 size + 1 이며
 *  					 이 빈공간은 배열의 상태를 위한 공간이다.(비어있거나 꽉 차있다는 것을 확인하기 위함.)
 *  
 *  -- 실수 한것 : 배열의 size를 받아오는데 이것이 문제였다 배열 size는 size + 1 이기 때문에 헷갈리는 것 보단 
 *  			 배열의 length를 이용하는것이 좋다. 
 *  
 *  -- 생각하게 만들었던 것 : Circular Queue 이기 때문에 queue가 remove 되고 나서 다시 삽입할때 꽉 차있는지 비어있는지에 대해서
 *  					  생각해야 된다. 배열의 length 만큼을 더 생각해야된다 한 바퀴 돌았을 때를 생각
 * 					 	  boolean을 체크하기 위해 메소드에서 or( || ) 연산자를 이용 하여 두개 이생의 조건에서 하나만 만족해도
 * 						  true//false 를 반환하도록 할 수 있다.
 *  
 */

/**
 * @FileName    : CircularQ.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 8. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 :
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


