package 평균구하기;

class Solution{

	double solution(int arr[]) {
	    double answer = 0;
	    for(int i=0; i<arr.length; i++){
	        answer+=arr[i];
	    }
	    return answer/arr.length;
	}
}
public class 평균구하기 {
	
	public static void main(String[] args) {
		
		Solution test = new Solution();
		int arr[] = {3,2,5,6};
		
		System.out.println(test.solution(arr));
	}
}
