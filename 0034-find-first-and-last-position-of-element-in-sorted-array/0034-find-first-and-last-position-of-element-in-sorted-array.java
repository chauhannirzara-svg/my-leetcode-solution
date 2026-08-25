class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=(nums.length-1);
        int ans1=-1,ans2=-1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid]<target){
                l=mid+1;
                }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                ans1=mid;
                r=mid-1;
            }
        }
        l=0;
        r=(nums.length-1);

        while(l<=r){
            int mid= l+(r-l)/2;
            if(nums[mid]<target){
                l=mid+1;
                }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                ans2=mid;
                l=mid+1;
            }
        }
        int[] arr=new int[2];
        arr[0]=ans1;
        arr[1]=ans2;
        return arr;

    }
}