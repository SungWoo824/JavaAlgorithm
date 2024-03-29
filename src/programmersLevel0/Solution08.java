package programmersLevel0;

import java.util.Arrays;
import java.util.Locale;

public class Solution08 {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase(Locale.ROOT);
        char[] tempArr = my_string.toCharArray();
        Arrays.sort(tempArr);
        StringBuffer bufferAnswer = new StringBuffer();
        for (int i = 0 ; i < tempArr.length ; i++) {
            bufferAnswer.append(tempArr[i]);
        }
        return bufferAnswer.toString();
    }
}
/*
문제 설명
영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.

제한사항
0 < my_string 길이 < 100
입출력 예
my_string	result
"Bcad"	"abcd"
"heLLo"	"ehllo"
"Python"	"hnopty"
 */