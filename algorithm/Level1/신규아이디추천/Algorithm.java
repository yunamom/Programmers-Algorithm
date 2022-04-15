package 신규아이디추천;

class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();

        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        answer = answer.replaceAll("[.]{2,}", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");      
        if (answer.equals("")) { 
            answer += "a";
        }
        if (answer.length() >= 16) { 
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$","");
        }
        if (answer.length() <= 2) { 
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }
        return answer;
    }
}

public class Algorithm {
	
	public static void main(String[] args) {
		
		/* 테스트 코드 입니다. */
		String new_id = "abcdefghijklmn.p";
		
		Solution test = new Solution();
		
		System.out.println(test.solution(new_id));
		
	}
}