class Solution {
    public boolean containsDuplicate(int[] nums) {
        int arrlen = nums.length;
        int flag = 1;
        if (arrlen <= 0 ){
            return false;
        }
        else{
            for (int i = 0 ; i < arrlen ; i++){
                int checker = nums[i];
                for (int j = i+1 ; j < arrlen ; j++){
                    if (checker == nums[j]){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 0){
                    return true;
                }
            }
        }
        if(flag == 0){
            return true;
        }
        else{
            return false;
        }
    }
}