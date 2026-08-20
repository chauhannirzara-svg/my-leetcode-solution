class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
        int m=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
           
            }
        
        int s=(a*(a+1))/2;
        return s-sum ;
        
    }
}