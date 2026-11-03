class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int sum=0;
        for(int i :nums){
            if(max<i){
                max=i;
            }
        }
        for(int i:  nums){
            int diff=max-i;
            sum+=diff;
        }
       return sum;
        
    }
}