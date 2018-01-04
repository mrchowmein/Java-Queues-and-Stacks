public class LinkedQueue<E>{
	

	private class Node {

		private E data;
		private Node next;
		private Node(E data){
			this.data = data;
		}
	}



	//remove from the head
	private Node head; 

	//add to the tail
	private Node tail;

	public boolean isEmpty(){
		return head == null;

	}

	public E peek() {
		return head.data;

	}

	public void add(E data){
		Node node = new Node(data);
		if (tail != null){
			tail.next = node;

		}
		tail = node;
		if (head == null) {
			head = node;
		}
	}

	public E remove(){

		E data = head.data;
		head = head.next;
		if (head == null){
			tail = null;
		}

		return data;
	}
}