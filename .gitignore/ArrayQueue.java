public class ArrayQueue {
	
	private int queueSize;

	private int [] arrayQueue;

	private int head;

	private int tail;

	public ArrayQueue(int arraySize){
		queueSize = arraySize;
		arrayQueue = new int[arraySize]; 
		head = 0;
		tail = -1;
	}

	public void add(int data){
		tail++;
		arrayQueue[tail] = data;


	}

	public int remove(){
		int temp = arrayQueue[head];
		head++;
		return temp;
	}

	public int peek(){
		return arrayQueue[head];

	}

	public boolean isEmpty(){

		if(head > tail){
			return true;
		} else {
			return false;
		}
	}


}