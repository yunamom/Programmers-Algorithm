package 신고결과받기;

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++) {
        
        	index.put(id_list[i], i);
        }
        
        for(String rep : report) {
        	/* 공백을 기준으로 나누어준다. */
        	String[] id = rep.split(" ");
        	
        	/* 본인이 신고한경우 제외 */
        	if(!list.containsKey(id[1])) {
        		list.put(id[1], new ArrayList<>());
        	}
        	List<Integer> temp = list.get(id[1]);
        	/* 중복 신고 제외 */
        	if(!temp.contains(index.get(id[0]))) {
        		temp.add(index.get(id[0]));
        	}
        }
        for(String id : id_list) {
        	if(list.containsKey(id) && list.get(id).size() >= k) {
        		for(int idx : list.get(id)) {   			
        			answer[idx]++;
        		}		
        	}
        }
        return answer;
    }
}
public class Algorithm {
	
	public static void main(String[] args) {
		
		Solution test = new Solution();
		/* test code 테스트 코드 입니다. */
		String[] id_list = {
				"muzi",
				"frodo",
				"apeach",
				"neo"};
		
		String[] report = {
				"muzi frodo",
				"apeach frodo",
				"frodo neo",
				"muzi neo",
				"apeach muzi"};
		
		System.out.println(Arrays.toString(test.solution(id_list, report, 2)));
	}
}
