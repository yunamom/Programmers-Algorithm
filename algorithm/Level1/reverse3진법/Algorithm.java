package reverse3진법;

class Solution{
	
	 
	  public int solution(int n) {
	      String answer = "";
	           
	      while(n > 0) {
	    	  
	    	  answer += n%3; 
	    	  n/=3;
	    	  
	      }	      
	      return Integer.parseInt(answer,3);
	    }
}

public class Algorithm {
	
	public static void main(String[] args) {
		
		int n = 45;
		
		Solution test = new Solution();
		System.out.println(test.solution(n));	
	}
}