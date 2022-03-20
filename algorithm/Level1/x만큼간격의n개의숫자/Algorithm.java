package x만큼간격의n개의숫자;

import java.util.Arrays;

class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
       
        for(int i=0; i<n; i++) {
        	answer[i] = x*(i+1);
        }     
        return answer;
    }
}

public class Algorithm {
	
	public static void main(String[] args) {
	
		Solution test = new Solution();
		
		System.out.println(Arrays.toString(test.solution(2, 5)));
	}
}