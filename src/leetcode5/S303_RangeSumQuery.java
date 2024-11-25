package leetcode5;

import java.util.Arrays;

public class S303_RangeSumQuery {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{0,1,5,-1,4});
        System.out.println(numArray.sumRange(2,4));
    }

    public static class NumArray {
        int[] nums;
        int[] sums;
        public NumArray(int[] nums) {
            this.nums = nums;
            sums = new int[nums.length];
            sums[0] = nums[0];
            for (int i = 1 ; i <nums.length ; i++) {
                sums[i] = sums[i-1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return sums[right] - (left>0?sums[left-1]:0);
        }
    }
}
/*
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).


Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3


Constraints:

1 <= nums.length <= 104
-105 <= nums[i] <= 105
0 <= left <= right < nums.length
At most 104 calls will be made to sumRange.
 */