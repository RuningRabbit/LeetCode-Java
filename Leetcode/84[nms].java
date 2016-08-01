import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s=new Stack<Integer>();
        
        int i=0;
        int max=0;
        
        while(i<heights.length){
        	if(s.empty()||heights[s.peek()]<=heights[i])
        		s.push(i++);
        	else{
        		int t=s.pop();
        		max=Math.max(max, heights[t]*(s.empty()?i:i-s.peek()-1));
        	}
        }

        int len=heights.length;
        while (!s.empty()) {  
        	int t=s.pop();
    		max=Math.max(max, heights[t]*(s.empty()?len:len-s.peek()-1));      
          }  
        return max;
    }
    
}
