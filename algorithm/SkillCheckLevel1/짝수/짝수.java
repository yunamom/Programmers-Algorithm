package 짝수;

class Solution1 {
    public int solution(int num) {
       
        int answer = 0;
        long nums = (long)num;
        //중요 !! long 타입으로 변환시켜서 숫자가 커질경우를 대비한다.
        while(nums > 1){
            if(answer >= 500){
                answer = -1; break;
            }
            if(nums % 2 == 0){
                nums/=2;
            }else{
                nums*=3; nums++;
            }
            answer++;
        }
        return answer;
    }
}

public class 짝수 {

	public static void main(String[] args) {
		
		Solution1 test = new Solution1();
		
		System.out.println(test.solution(626331));
	}
}