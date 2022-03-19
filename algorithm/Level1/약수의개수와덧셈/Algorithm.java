package 약수의개수와덧셈;

class Solution { 
	public int solution(int left, int right) {
		int answer = 0; 
		
		for (int i=left;i<=right;i++) {
			/* 제곱수인 경우 약수의 개수가 홀수 */
			if (i % Math.sqrt(i) == 0) {
				answer -= i; 
			} 
			/* 제곱수가 아닌 경우 약수의 개수가 짝수 */ 
			else {
				answer += i; 
			} 
		} 
		return answer; 
	} 
}
public class Algorithm {
	
	public static void main(String[] args) {
		
		int left = 13;
		int right = 17;
		Solution test = new Solution();
		
		System.out.println(test.solution(left, right));	
	}
}
