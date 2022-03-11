package reverse3진법;

class SolutionB{
	
	  public int solution2(int num , int x) {
		 int answer = 0;
		
		 /* for(int i=s.length()-1; i>=0; i--) {
			  answer += ((int)s.charAt(i) - '0') * (Math.pow(x,(s.length()-1)-i));
		   }
		 */	    
		
		 int cnt = 0;
	
		 while(num > 0) {
			 answer += (int) (num%10 * (Math.pow(x,cnt))); 
			 cnt++; 
			 num/=10;
		 }
		  return answer;
	  }
	
	public int solution(int num , int x) { 
	
		String s = "";		
		while(num > 0) {  
		    s=num%x+s; // forward
		    // s += num%x <- reverse
		    num/=x;	     
		}
			
		return Integer.parseInt(s);
	}
}
public class BinaryNumber_A_to_B_to_A {
	
	public static void main(String[] args) {

		int num = 45; 
		int x = 3; //진수 변수
		
		SolutionB test = new SolutionB();
		System.out.printf("10진수 : %-5d -> %-2d진수 : %d\n\n",num,x,test.solution(num, x));
		// 10진수를 - > x 진수로 변환
		int binary_x = test.solution(num, x);
		
		System.out.printf("%-2d진수 : %-5s -> 10진수 : %d\n\n",x,binary_x,test.solution2(binary_x, x));
		// x 진수를 -> 10 진수로 변환
	}
}