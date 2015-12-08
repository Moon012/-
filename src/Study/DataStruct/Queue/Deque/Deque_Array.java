package Study.DataStruct.Queue.Deque;

/**
 * @FileName    : Deque_Array.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 8. 
 * @�ۼ���       : Moon
 * @�����̷�     :
 * @���α׷� ���� : Deque(double-ended queue)�� ���� ����Ʈ�� ���� �� ��ο��� �ڷῡ ���� ����, ���� ����
 * 
 * -- �� ���� : �迭�� ������ �����Ǵ� ������ ������ �������� ���� queue�� ����. �� �ڷ� ����, ������ �ֱ⶧����
 * 			  ���� �� ������ ������ ������ ������ ���Ѵ�.
 */


public class Deque_Array {

		private int left;
		private int right;
		private int front;
		private int rear;
		private int size;
		private long[] QueueArray;
		
		
		public Deque_Array(int size) {
			this.size = size;
			QueueArray = new long[size];
			
			//���� ���
			this.rear = -1 ;
			this.right = QueueArray.length; // size - 1 ���� �򰥸��� length!
			
			// ���� ��� 
			this.front = 0;
			this.left = right;
			
		}
		
		
		public boolean insertRear(long item){
			
			if( isFull() ){

				System.out.println("queue is full");
				return false;
				
			}else{
				
				QueueArray[++rear] = item;
				return true;
			}
			
		}
		
		
		public boolean insertRight(long item){
			
			if( isFull() ){

				System.out.println("queue is full");
				return false;
				
			}else{
				
				QueueArray[--right] = item;
				return true;
			}
			
		}
		
		
		public boolean removeFront(long[] item){
			
			if( isEmpty() ){
				System.out.println("queue is empty");
				return false;
			}else{
				
				item[0] = QueueArray[front++];
				return true;
			}
		}
		
		
		public boolean removeleft(long[] item){
			
			if( isEmpty() ){
				System.out.println("queue is empty");
				return false;
			}else{
				
				item[0] = QueueArray[left--];
				return true;
			}
		}
		
		public void peek(){
			
			System.out.println(QueueArray[left] + " left");
			System.out.println(QueueArray[right] + " right");
		}
		

		private boolean isFull() {
			
			return (rear + 1 == right);
		}
		
		private boolean isEmpty(){
			
			return ((front == rear) && (left == right));
		}

		public void display(){
			
			for(int i = 0; i<QueueArray.length; i++){
				System.out.println(QueueArray[i]);
			}
			
		}
		
		public void variable(){
			
			System.out.println("rear : " + rear);
			System.out.println("front : " + front);
			System.out.println("right : " + right);
			System.out.println("left : " + left);
			
		}
}
