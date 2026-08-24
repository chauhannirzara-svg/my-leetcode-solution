class Solution {
    public static int signFunc(int x){
        if (x>0){
            return 1;
        }
        else if(x<0){
            return -1;
        }
        return 0;
    }
    public int arraySign(int[] nums) {
        int p=1;
   
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i] < 0){
                p *= -1;
            }
            else if(nums[i] == 0){
                p *= 0;
            }
        }
        return signFunc(p);
        
    }
}