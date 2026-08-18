class Solution {
    public int numberOfSteps(int num) {
        int sum=0;
        while(num!=0){
            if(num%2==0){
                num=num/2;
                sum+=1;
            }
            else{
                num=num-1;
                sum+=1;
            }
        }
        return sum;
        
    }
}