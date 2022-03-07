package 행렬의덧셈;

import java.util.Arrays;

class Solution10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {}; answer = arr1;
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}
public class 행렬의덧셈 {
	
	public static void main(String[] args) {
		
		Solution10 test = new Solution10();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
	    int[][] arr1 = {{1,2},{2,3}};
	    int[][] arr2 = {{3,4},{5,6}};
	      
		System.out.println(Arrays.deepToString(test.solution(arr1, arr2)));    
	}
}