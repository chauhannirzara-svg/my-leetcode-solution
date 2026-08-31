class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int ans=-1;
        while(l<=r){
            int mid=l + (r-l)/2;
            if(nums[mid]<=nums[nums.length-1]){
                ans=mid;
                r=mid-1;

            }
            else{
                l=mid+1;
            }

        }
        return nums[ans];
        
    }
}