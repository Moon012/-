package Study.DataStruct.Queue.Circular_Queue;

/**
 * @FileName    : CircularQ2.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : 여기서 CircularQueue는 나머지 연산자(%)를 이용해 배열의 index를 초기화 시키는 것이 핵심!
 * 				 다만 배열의 크기를 전부 사용 해야 하기 때문에 배열안에 들어있는 데이터의 개수를 알아야하기 때문에 
 * 				 개수를 세줘야하는 변수가 하나 더 필요하다.
 */


public class CircularQ2 {
	
	private int rear;
	private int front;
	private int[] queueArray;
	private int count;
	
	public CircularQ2(int size){
		queueArray = new int[size];
		rear = 0;
		front = 0;
		count = 0;
	}
	
	public void insert(int item){
		
		if( isFull() ){
			System.out.println("queue is full");
		}else{
			
			rear = rear % queueArray.length;
			queueArray[rear++] = item;
			count++;
			
		}
	}
	
	public void remove(){
		
		if( isEmpty() ){
			
			System.out.println("queue is empty");
			
		}else{
			
			front = front % queueArray.length;
			System.out.println(queueArray[front]);
			front++;
			count--;
		
		}
		
	}
	
	public void display(){
		
		int intVar = front;
		
		while(intVar < queueArray.length ){
			
			System.out.println(queueArray[intVar++]);
		}
		
	}
	
	
	private boolean isEmpty() {
		
		return (count == 0);
	}

	private boolean isFull() {

		return (count == queueArray.length);
	}
	

}
