class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hash =  new HashMap<>();
        int[] arr =  new int[2];
        int sum = 0;
        for(int  i : nums){
            int count=hash.getOrDefault(i,0);
            hash.put(i,count+1);
            sum += i;

        }
        for(int i :hash.keySet()){
            if(hash.get(i)>1){
                arr[0]=i;
            }
        }
        arr[1] = (n * (n + 1) / 2) - sum + arr[0];
        return arr;
    }
}