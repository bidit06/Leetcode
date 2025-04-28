class Solution {
    public int[] getConcatenation(int[] nums) {
        int nums_len = nums.length;
        int[] ans = new int[nums_len * 2];

        for(int i = 0 ; i < nums_len ; i++){
            ans[i] = nums[i];
            ans[i + nums_len] = nums[i];
        }

        return ans;
    }
}