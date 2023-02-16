package programmersLevel0;

import java.util.Arrays;

public class Solution16 {
    public int solution(String[] s1, String[] s2) {
        int firstLength = s1.length;
        for (int i = 0 ; i < s2.length ; i++) {
            int index = i;
            s1 = Arrays.stream(s1).filter(item -> !item.equals(s2[index])).toArray(String[]::new);
        }
        return firstLength-s1.length;
    }
}
/*
문제 설명
두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ s1, s2의 길이 ≤ 100
1 ≤ s1, s2의 원소의 길이 ≤ 10
s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
s1과 s2는 각각 중복된 원소를 갖지 않습니다.
입출력 예
s1	s2	result
["a", "b", "c"]	["com", "b", "d", "p", "c"]	2
["n", "omg"]	["m", "dot"]	0
 */
