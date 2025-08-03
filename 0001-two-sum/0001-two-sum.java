class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer , Integer> check = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            int number = nums[i];
            int difference = target - number;

            if(check.containsKey(difference)){
                return new int[] {check.get(difference),i};
            }

            check.put(number , i);
        }

        return new int[]{};
    }
}