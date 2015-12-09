package Study.DataStruct.Queue.Circular_Queue;

/**
 * @FileName    : CircularQ2.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 9. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : ���⼭ CircularQueue�� ������ ������(%)�� �̿��� �迭�� index�� �ʱ�ȭ ��Ű�� ���� �ٽ�!
 * 				 �ٸ� �迭�� ũ�⸦ ���� ��� �ؾ� �ϱ� ������ �迭�ȿ� ����ִ� �������� ������ �˾ƾ��ϱ� ������ 
 * 				 ������ ������ϴ� ������ �ϳ� �� �ʿ��ϴ�.
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
