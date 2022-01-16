package prob5;

public class MyStack {
	private String[] stack = null;
	private int top = -1;
	
	MyStack(int num){
		stack = new String[num];
	}
	
	public void push(String str) {
		stack[++top] = str;
//		System.out.println(top);
	}

	public String pop() throws MyStackException  {
		if(this.isEmpty() == false) {
			return stack[top--];
		}else {
			throw new MyStackException("stack is empty");
		}
	}

	public boolean isEmpty() {
		if(stack == null || this.top == -1) {
			return true;
		}else return false;
	}
}