package 핸드폰번호가리기;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i=0; i<phone_number.length()-4; i++) answer += "*";
        
        answer += phone_number.substring(phone_number.length()-4);
        
        return answer;
    }
}

public class Algorithm {
	
	public static void main(String[] args) {
		/* 테스트 코드 입니다. */
		Solution test = new Solution();
		String phone_number="01033334444";
		
		System.out.println(test.solution(phone_number));
	}
}
