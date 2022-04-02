package 같은숫자는싫어;

import java.util.Arrays;

class Solution {
    public int[] solution(int []arr) {
    	
        int[] answer = new int[arr.length];
		  
        answer[0] = arr[0];
        int index = 0;
        for(int i=1; i<arr.length; i++) {
        	if(answer[index] != arr[i]) {
        		index++;
        		answer[index] = arr[i]; 
        	}
        }
        int[] a = new int[index+1];
        for(int i=0; i<a.length; i++) {
        	a[i] = answer[i];
        }
        return a;
    }
}

public class Algorithm {
	
	public static void main(String[] args) {
		
		Solution test = new Solution();
		
		int arr[] = {1,1,3,3,0,1,1};
		
		System.out.println(Arrays.toString(test.solution(arr)));
	}
}