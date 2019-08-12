package prob5;

public class MyStack {
	private int top;
	private String[] buffer;
	public MyStack(int size) {
		buffer = new String[size];
		top = -1;
	}
	public void push(String data) {
		if(top>=buffer.length-1) {
			System.out.println("Size Overflow");
			buffer = new String[buffer.length*2];
			buffer[++top]=data;
		}
		else
			buffer[++top]=data;
	}
	
	public String pop() throws Exception{
		  try { //return buffer[top--];
				  return buffer[top--];
			  
		  } catch(Exception e) { 
			  e = new MyStackException("stack is Empty"); 
			  return "stack is Empty";
		  }
	}
	public boolean isEmpty() {
		if(top<0)
			return false;
		else
			return true;
			
	}
}