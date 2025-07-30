class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 1){
            int count = 1;
            return count;
        }
        else{
            int left;
            int right;
            int count = 0;
            for(int i = 0 ; i < nums.length-1 ; i++){
                left = i;
                right = left + 1 ;

                if (nums[left] == nums[right]){
                    continue;
                }
                if (nums[left] != nums[right]){
                    nums[count+1] = nums[right];
                    count += 1;
                }
            }
            return count+1;

        }
        
    }

}