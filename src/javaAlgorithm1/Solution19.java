package javaAlgorithm1;

public class Solution19 {
	public static void main(String[] args) {
		
	}
	
	public boolean solution(String s) {
		   boolean answer = true;
		   int leng = s.length();
		   String[] a = new String[leng];
		   a = s.split("");
		   
		   if(leng !=4 && leng!=6) {
		 	  answer = false;
		   }
		   
		   for(int i = 0 ; i<leng ; i++) {
		 	  int check = s.charAt(i);
		 	  if(check<48 || check>57) {
		 		 
		 		 answer = false; 
		 	  }
		     else if(s.equals(""))
			{
				answer = false;
			}
		   }
		   
		   return answer;
		}
}

//
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
//
//제한 사항
//s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//입출력 예
//s	return
//a234	false
//1234	true

