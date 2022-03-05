package level1;

import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length-1; i++) {
        	for(int j=i+1; j<numbers.length; j++) {
        		set.add(numbers[i]+numbers[j]);
        	}
        }
        ArrayList<Integer>list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}

public class 두개뽑아서더하기 {
	
	public static void main(String[] args) {
		/*
		 * 정수 배열 numbers가 주어집니다. 
		 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 
		 * 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록
		 * solution 함수를 완성해주세요.*/
		
		Solution test = new Solution();
		
		int[] numbers = {2,1,3,4,1};
		System.out.println(test.solution(numbers));
	}
}