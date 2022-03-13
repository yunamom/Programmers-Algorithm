package 문자열바꾸기;

class Solution {
    public int solution(String s) {
        int answer = Integer.parseInt(s.substring(1));
        if(s.charAt(0) == '-') {
        	return answer - answer*2;
        }
        //return Integer.valueOf(s);
        return Integer.parseInt(s);
    }
}

public class Algorithm {

	public static void main(String[] args) {
		Solution test = new Solution();
		
		System.out.println(test.solution("-234"));
	}
}
