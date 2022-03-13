package 내림차순배치;

import java.util.Arrays;

class Solution {
	
    public long solution(long n) {
    	String answer = "";
    	
    	char []numbers = Long.toString(n).toCharArray(); 
    	
    	Arrays.sort(numbers);  
    	
    	for(char num:numbers) answer = num+answer;
        
    	return Long.parseLong(answer);
    }
}
public class Algorithm {
	
	public static void main(String[] args) {
		
		Solution test = new Solution();
		System.out.println((test.solution(351235183)));
	}
}
