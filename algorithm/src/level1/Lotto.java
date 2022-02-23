package level1;

import java.util.Arrays;

class Solution{
	
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] score = {6,6,5,4,3,2,1};
        
        int zero_count = 0, min = 0;
     
        for (int i = 0; i < lottos.length; i++) {
        	if(lottos[i] == 0) {
        		zero_count++;
        		continue;
        	}
        	for (int j = 0; j < win_nums.length; j++) {
				if(lottos[i] == win_nums[j]){
					min++;
					break;
				}
			}
		}
        answer[0] = score[zero_count+min];
        answer[1] = score[min];
   
        return answer;
    }
}
public class Lotto {
	public static void main(String[] args) {
		int lottos[] = {44, 1, 0, 0, 31, 25};
		int win_nums[] = {31, 10, 45, 1, 6, 19};
		
		Solution test = new Solution();
		System.out.println(Arrays.toString(test.solution(lottos, win_nums)));
	}
}
