# 3진법 뒤집기 - Reverse actual bits of the given number

📌 문제 설명 

자연수 n이 매개변수로 주어집니다.
n을 3진법 상에서 앞뒤로 뒤집은 후,
 
이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 
>입출력 예

| 45 | 7 |
|--|--|
| 125 | 229 | 
	

>입출력 예 설명

입출력 예 #1

답을 도출하는 과정은 다음과 같습니다.

n (10진법)n (3진법)앞뒤 반전(3진법)10진법으로 표현

| 45 | 1200 | 0021 | 7 |
|--|--|--|--|
			
따라서 7을 return 해야 합니다.

입출력 예 #2

답을 도출하는 과정은 다음과 같습니다.

n (10진법)n (3진법)앞뒤 반전(3진법)10진법으로 표현

| 125 | 11122 | 22111 | 229 |
|--|--|--|--|
			
따라서 229를 return 해야 합니다.

>제출한 정답코드

```
class Solution {
    public int solution(int n) {
        String answer = "";
        while(n > 0){
            answer += n%3; n/=3;
        }
        return Integer.parseInt(answer,3);
    }
} // n이 45일때 -> 0021
```
사실뒤집기는 문자열에 계속 더해준 그 숫자를 바로 적용하면되서 간단하다. 
 
💡그렇다면 뒤집기가 아닌 10진수 -> 3진수 -> 10진수를 구하려면 ? 

```
class Solution {
    public int solution(int n) {
        String answer = "";
        while(n > 0){
            answer = n%3+answer; // <- 이부분만 변경해주면된다.
            n/=3;
        }
        return Integer.parseInt(answer,3);
    }
} // n이 45일때 -> 1200
```

여기서 Integer.parseInt(answer,3) 이 함수는 어떻게 만들어지는걸까?
 
이 함수를 이용하지 않고 값을 구하는 방법은 무엇일까 ?

```
public int solution(int num , int x) { 
	
		String s = "";		
		while(num > 0) {  
		    s+=num%x;
		    num/=x;	     
		}
			
		return Integer.parseInt(s); // num이 45일때 -> 21
	}
```
```
public int solution2(int num , int x) {
		 int answer = 0;
		 int cnt = 0;
	
		 while(num > 0) {
			 answer += (int) (num%10 * (Math.pow(x,cnt))); 
			 cnt++; 
			 num/=10;
		 }
		  return answer; // num이 45일때 -> 7
	  }
```

10진수 : 45   -> 3 진수 : 21
3 진수 : 21    -> 10진수 : 7
 
45 를 3진수로 변환한후 뒤집은 숫자 21 을 10진수 로 변환하였다.
 
뒤집지 않고 10 진수 -> 3 진수 -> 10진수로 변환하려면?
```
s=num%x+s; // <-💡이부분만 변경해주면된다.
```

### ∙ solution2 의 부분을 자세히 봐보자.

```
public int solution2(int num , int x) {
		 int answer = 0;
		 int cnt = 0;
         
		 while(num > 0) {
			 answer += (int) (num%10 * (Math.pow(x,cnt))); cnt++;	
			 num/=10;
		 }
		  return answer;
	  }
```

>Math.pow()를 이용하여 거듭제곱을 계산할 수 있습니다. 
>
>pow는 power를 의미하고, power의 뜻은 거듭제곱입니다.
>
>pow() 인자로 a와 b를 전달하며, a의 b 제곱이 리턴됩니다. 
>
>즉, a를 b번 곱한 값이 리턴됩니다.

<img width="296" alt="Screen Shot 2022-03-11 at 11 07 44 AM" src="https://user-images.githubusercontent.com/91236026/157795097-25c42f18-40d1-405b-b57b-dafa7bc9a16d.png" > <img width="296" alt="Screen Shot 2022-03-11 at 11 14 13 AM" src="https://user-images.githubusercontent.com/91236026/157795102-b8fec26c-f79a-4032-afe8-5083f171b40e.png">

  Forward a number  /  Reverse a number