package level1;

import java.util.Arrays;

class Solution {
	
	int[] num1 = {1,2,3,4,5};
	int[] num2 = {2,1,2,3,2,4,2,5};
	int[] num3 = {3,3,1,1,2,2,4,4,5,5};
	int[] score = new int[3];
	
	
    public int[] solution(int[] answers) {
        
        for(int i=0; i<answers.length; i++) {
        	if(num1[i%num1.length] == answers[i]) score[0]++;
        	if(num2[i%num2.length] == answers[i]) score[1]++;
        	if(num3[i%num3.length] == answers[i]) score[2]++;     	
        }
        int max = -1;
        for(int scores:score) {
        	if(max < scores) max = scores;
        }
        int index = 0;
        for(int scores:score) {
        	if(max == scores) index++; //동점여부 확인
        }
        int[] answer = new int[index];
        
        index = 0;
        for(int i=0; i<score.length; i++) {
        	if(score[i] == max) {
        		answer[index] = i+1; //가장 높은 점수를 가진 학생의 번호 넣기
        		index++;
        	}
        }    
        return answer;
    }
}
public class 모의고사 {
	
	public static void main(String[] args) {
		
		Solution test = new Solution();
		
		int []answers = {1,3,2,4,2};
			
		System.out.println(Arrays.toString(test.solution(answers)));
	}
}
