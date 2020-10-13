package stack;

public class ArrayStack {
	int top;
	int [] stack;
	int size;
	
	public ArrayStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top == size-1)
			return true;
		else
			return false;
	}
	
	public void doPush(int num) {
		if(isFull()) return;
		stack[++top] = num;
	}
	
	public void doPop() {
		if(isEmpty()) return;
		stack[top--] = 0;
	}
}