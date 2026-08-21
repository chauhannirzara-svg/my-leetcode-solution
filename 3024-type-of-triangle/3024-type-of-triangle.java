class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        String a2="";
        if(a+b<=c || b+c<=a || c+a<=b){
             a2= "none";
        }
        
        else if(a==b && b==c){
            a2= "equilateral";
        }
         else if(a==b || b==c || c==a){
            a2="isosceles";
        }
        else if(a+b>c && b+c>a && c+a>b){
             a2= "scalene";
        }
        
       
        return a2;
        
    }
}