class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> l =  new ArrayList<>();
    int max = candies[0];
    for(int i : candies){
        if(max<i){
                max=i;
        }
            
    }
    for(int i : candies){
        if(i+extraCandies>=max){
            l.add(true);
        }
        else{
            l.add(false);
        }
    }
       return l; 
    }
}