class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr  = new int[friends.length];
        int a =0;
        for(int i=0 ; i<order.length ; i++){
            for(int j=0; j<friends.length;j++){
                
                if(order[i]==friends[j]){
                    arr[a]=order[i];
                    a++;
                }
             
            }
        }    
        return arr;   
    }
}