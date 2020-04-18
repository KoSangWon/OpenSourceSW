package ku.opensrcsw.StackLibrary;

public class Stack {
	private int top;
	int [] stack;
	int size;
	
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		setTop(-1);
	}
	
	public boolean isEmpty() {
		if(getTop() == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(getTop() == size-1)
			return true;
		else
			return false;
	}
	
	public void doPush(int num) {
		if(isFull()) return;
		stack[setTop(getTop() + 1)] = num;
	}
	
	public void doPop() {
		if(isEmpty()) return;
		stack[top--] = 0;
	}

	public int getTop() {
		return top;
	}

	public int setTop(int top) {
		this.top = top;
		return top;
	}
}
