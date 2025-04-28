class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int final_wealth = 0;
        for(int[] row : accounts){
            for(int element : row){
                wealth += element;
            }
            
            if(final_wealth <= wealth){
                final_wealth = wealth;
            }
            wealth = 0;
        }

        return final_wealth;
    }
}