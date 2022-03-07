package 숫자영단어;

class Solution4 {
    public int solution(String s) {
        String[] num = {"zero","one",
        				"two","three",
        				"four","five",
        				"six","seven",
        				"eight","nine"};
        for(int i=0; i<num.length; i++){
        	s = s.replaceAll(num[i],i+"");
        }       
        return Integer.parseInt(s);
    }
}
public class 숫자영단어 {

	public static void main(String[] args) {
		Solution4 test = new Solution4();
		
		System.out.println(test.solution("2three45sixseven"));
	}
}