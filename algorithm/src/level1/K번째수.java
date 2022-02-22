package level1;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
        	int[]temp = new int[commands[i][1]-(commands[i][0]-1)];
        	for(int j=0; j<temp.length; j++) {
        		temp[j] = array[j+(commands[i][0]-1)];
        	}
        	Arrays.sort(temp);
        	answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
public class K번째수 {

	public static void main(String[] args) {
		int array[] = {1, 5, 2, 6, 3, 7, 4};
		int commands[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		Solution test = new Solution();
		System.out.println(Arrays.toString(test.solution(array,commands)));
	}
}