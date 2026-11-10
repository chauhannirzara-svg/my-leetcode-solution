class Solution {
    public int hammingDistance(int x, int y) {
        int n = x^y;
        int sum=0;
        while(n>0){
            sum+=n%2;
            n=n>>1;

        }
        return sum;
    }
}