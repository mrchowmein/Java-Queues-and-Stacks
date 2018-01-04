public class ArrayStack {
	

	private String[] stackArray;

	private int stackSize;

	private int topOfStack;

	public ArrayStack(int size){

		stackSize = size;

		stackArray = new String[size];

		topOfStack = -1;// index of top of stack

	}

	public void push(String s){
		
		if(topOfStack+1 < stackSize){
			topOfStack++;
			stackArray[topOfStack] = s;
		} else {
			System.out.println("Error: Stack full");
		}
	}

	public String pop(){
		if(topOfStack > 0){
			String s = stackArray[topOfStack];
			topOfStack--;
			return s;
		} else {
			return "Error: Stack is empty";
		}

	}

	public String peek(){

		if(topOfStack>0){
			return stackArray[topOfStack];
		} else {
			return "Error: Stack is empty";
		}

	}

	public boolean isEmpty(){
		if(stackArray[topOfStack].equals("-1")){
			return true;
		} else{
			return false;
		}
	}

}