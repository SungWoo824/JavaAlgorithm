package programmersLevel0;

import java.util.HashSet;
import java.util.Set;

public class Solution29 {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        Set<Character> checkSet = new HashSet<>();
        char[] splitArr = my_string.toCharArray();
        for (int i = 0 ; i < my_string.length() ; i++) {
            if(checkSet.add(splitArr[i])) {
                answer.append(splitArr[i]);
            }
        }

        return answer.toString();
    }
}
/*
문제 설명
문자열 my_string이 매개변수로 주어집니다.
my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ my_string ≤ 110
my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
대문자와 소문자를 구분합니다.
공백(" ")도 하나의 문자로 구분합니다.
중복된 문자 중 가장 앞에 있는 문자를 남깁니다.
입출력 예
my_string	result
"people"	"peol"
"We are the world"	"We arthwold"
 */