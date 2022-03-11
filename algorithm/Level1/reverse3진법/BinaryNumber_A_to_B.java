package reverse3진법;

class SolutionA{
	
	public String solution(int num , int x) {
	
		String s = "%";
		String answer = "";
		while(num > 0) {  
			System.out.printf("%3d %s %d = %d \n",num,s,x,num%x);
			answer = num%x+answer;
		    num/=x;	     
		}
		return answer;
	}
}
public class BinaryNumber_A_to_B {
	
	public static void main(String[] args) {

		 	int num = 125; 
			int x = 3; //진수 변수
		
		SolutionA test = new SolutionA();
		
		System.out.println(test.solution(num, x));
	}
}