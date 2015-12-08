package Study.DataStruct.Queue.Deque;

/**
 * @FileName    : Deque_Array.java
 * @Project     : myStudy
 * @Date        : 2015. 12. 8. 
 * @작성자       : Moon
 * @변경이력     :
 * @프로그램 설명 : Deque(double-ended queue)는 양쪽 리스트의 양쪽 끝 모두에서 자료에 대한 삽입, 삭제 가능
 * 
 * -- 내 생각 : 배열로 만들어보니 삭제되는 공간의 재사용이 떨어지는 것은 queue와 같다. 앞 뒤로 삽입, 삭제가 있기때문에
 * 			  편할 수 있으나 삭제된 공간을 재사용을 못한다.
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
			
			//삽입 출발
			this.rear = -1 ;
			this.right = QueueArray.length; // size - 1 같음 헷갈리면 length!
			
			// 삭제 출발 
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
