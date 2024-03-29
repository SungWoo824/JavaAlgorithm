package programmersLevel0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution20 {
    public static int[] solution(int n) {
        List<Integer> resultArr = new ArrayList<>();

        for (int i = 1 ; i <= n ; i++) {
            if (n%i == 0 ){
                resultArr.add(i);
            }
        }
        Collections.sort(resultArr);
        int[] answer = new int[resultArr.size()];
        for (int i = 0 ; i < resultArr.size() ; i++) {
            answer[i] = resultArr.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 24;
        solution(n);
    }
}
/*
문제 설명
정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10,000
입출력 예
n	result
24	[1, 2, 3, 4, 6, 8, 12, 24]
29	[1, 29]
 */