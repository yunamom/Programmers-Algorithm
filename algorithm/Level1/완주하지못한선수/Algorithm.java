package 완주하지못한선수;

import java.util.HashMap;

class Solution { 
	
	public String solution(String[] participant, String[] completion) { 
		
		String answer =""; 
		HashMap<String, Integer> hash = new HashMap<>(); 
		for(String player : participant) hash.put(player, hash.getOrDefault(player, 0) + 1); 
		for(String player : completion) hash.put(player, hash.get(player) -1); 
		for(String key : hash.keySet()) { 
			if(hash.get(key) != 0) { 
				answer = key; break;
			} 
		} 
		return answer; 
	} 
}

public class Algorithm {
	
	public static void main(String[] args) {
		
		/* 테스트 코드 입니다. */
		String participant[] = {"mislav", "stanko", "mislav", "ana"};
		String completion[] = {"stanko", "ana", "mislav"};
		
		Solution test = new Solution();
		
		System.out.println(test.solution(participant, completion));	
	}
}
