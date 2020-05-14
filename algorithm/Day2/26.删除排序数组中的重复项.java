/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        int pre = 0;
        for (int i = 0; i < nums.length; i++) {

            if (pre == 0&&i==0){
                continue;
            }

            if (nums[pre] != nums[i] && i-pre>1){
                nums[pre+1] = nums[i];
                pre ++;
            }
            
            if (nums[pre] != nums[i] && i-pre==1){
                pre ++;
            }
        }
        return pre+1;
    }
}
// @lc code=end

