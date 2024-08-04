package Arrays.Medium;

/**
 * 55. Jump Game
 *
 * Link: https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
 *
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 *
 * Return true if you can reach the last index, or false otherwise.
 *
 * Example 1:
 *
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * Example 2:
 *
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 105
 */

public class JumpGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if(len <= 1){
            return true;
        }
        int goal = len - 1;
        int jump = 1;
        boolean flag = false;
        while(goal >= jump && jump <= len-1){
            if(nums[goal-jump] >= jump){
                flag = true;
                goal--;
                jump = 1;
            } else {
                flag = false;
                jump++;
            }
        }
        return flag;
    }
}
