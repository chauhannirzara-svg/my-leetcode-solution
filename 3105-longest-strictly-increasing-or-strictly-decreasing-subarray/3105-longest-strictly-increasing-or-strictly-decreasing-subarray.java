class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1 , up =1, down =1;
        
        for(int i = 1 ; i<nums.length ; i++){
            if(nums[i-1]>nums[i]){
                up+=1;
               
            }
            else{
                up=1;
            }
           
            if(nums[i-1]<nums[i]){
                down+=1;
                 
            }
            else{
                down=1;
            }
            max= Math.max(max,Math.max(up,down));
        }
        return max;
        
    }
}