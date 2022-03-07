package PrimeNumber;

class Solution {
    public int solution(int n) {
    	 int answer = 0;
         
         int[] number = new int[n+1];
         //소수찾기 (에라토스테네스의 체) 배열에 2~n까지 저장
         for(int i=2; i<=n; i++) {
             number[i] = i;
         }
        
         for(int i=2; i<=n; i++) {
             if(number[i]==0) continue;
             //2~n까지 지우지 않은 값은 소수
             for(int j= 2*i; j<=n; j += i) {
                 number[j] = 0;
             }
         } 
         for(int i=0; i<number.length; i++) {
             if(number[i]!=0) {
                 answer++;
             }
         } 
       return answer;
   }
}
public class PrimeNumber {
	
	public static void main(String[] args) {
		Solution test = new Solution();
		
		System.out.println(test.solution(50000));
	}
}
