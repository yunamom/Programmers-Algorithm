package level1;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<absolutes.length; i++) {
        	
        	answer += absolutes[i] * (signs[i]? 1 : -1);
        	//true 이면 1을 곱하고 false 는 -1을 곱합으로써 음수로 만듭니다.
        }    
        return answer;
    }
}

public class 음양더하기 {
	
	public static void main(String[] args) {
		
		Solution test = new Solution();
		//true 는 양수 false 는 음수 아래는 테스트를 위한 작성입니다.
		int absolutes[] = {4,7,12};
		boolean signs[] = {true,false,true};
		System.out.println(test.solution(absolutes, signs));
	}
}
