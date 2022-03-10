package 없는숫자더하기;

class Solution {
    public int solution(int[] numbers,int num) {
        int answer = num*(num+1)/2;
     
        for(int number:numbers){
        	answer -= number;
        }
        return answer;
    }
}
public class 없는숫자더하기 {
	public static void main(String[] args) {
		
		int numbers[] = {1,2,3,4,6,7,8,0};
		int num = 9; //0부터 9까지
		Solution test = new Solution();
		
		System.out.println(test.solution(numbers,num));
	}
}