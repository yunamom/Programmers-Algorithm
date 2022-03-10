package 내적;

class Solution{
	public int solution(int[] a,int[] b) {
		int answer = 0;
		int i=0;
		while(i < a.length){
			answer += a[i]*b[i]; i++;
		}		
		return answer;
	}
}

public class Algorithm {
	
	public static void main(String[] args) {
		
		int []a = {1,2,3,4};
		int []b = {-3,-1,0,2};
		
		Solution test = new Solution();
		System.out.println(test.solution(a, b));		
	}
}