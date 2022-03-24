package 수박수박;

class Solution {
    public String solution(int n) {
        String answer = "";
        int num = 0;
        while(num<n) {
        	answer+=(num%2==0)?"수":"박"; num++;
        }
        return answer;
    }
}
public class Algorithm {

	public static void main(String[] args) {
		
		Solution test = new Solution();
		System.out.println(test.solution(5));
	}
}