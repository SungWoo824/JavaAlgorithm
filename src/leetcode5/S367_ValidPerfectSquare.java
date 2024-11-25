package leetcode5;

public class S367_ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int pivotNum = 1;
        while (Math.pow(pivotNum,2) <= num) {
            if (Math.pow(pivotNum,2) == num) {
                return true;
            } else {
                pivotNum++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println((int)Math.log10(num)+1);
    }
}
/*
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.



Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:

Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

 */