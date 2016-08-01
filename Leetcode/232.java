import java.util.Stack;

class MyQueue {
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    public void push(int x) {
        s1.push(x);
    }

    
    public void pop() {
        while(!s1.empty())
        	s2.push(s1.pop());       
        s2.pop();
        while(!s2.empty())
        	s1.push(s2.pop());  
    }
   
    public int peek() {
    	while(!s1.empty())
        	s2.push(s1.pop());       
        int res=s2.peek();
        while(!s2.empty())
        	s1.push(s2.pop());  
        return res;
    }

    
    public boolean empty() {
        return s1.empty();
    }
}
