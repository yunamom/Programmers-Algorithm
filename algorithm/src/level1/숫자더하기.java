package level1;

class Solution {
    public int solution(int numbers) {
        int answer = numbers*(numbers+1)/2;
        return answer;
    }
}
public class 숫자더하기 {
	public static void main(String[] args) {
		
		Solution test = new Solution();
		System.out.println(test.solution(100));
	}
}