package 소수만들기;

class Solution {
    
    public boolean isPrime(int num){
        if( num == 1)
            return false;
        
        for(int i = 2; i < num; i++){
            if( num % i == 0)
                return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length-2; i++){
            for(int j = i + 1; j < nums.length-1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    int r = nums[i] + nums[j] + nums[k];
                    if( this.isPrime(r) == true ){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}

public class 소수만들기 {
	
	public static void main(String[] args) {
		Solution test = new Solution();
		
		int[] nums= {1,2,7,6,4};
		
		System.out.println(test.solution(nums));
	}
}