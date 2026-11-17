class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }
        HashSet<Character> hash = new HashSet<>();
        for(char i :  sentence.toCharArray()){
            hash.add(i);
        }
        return hash.size()==26;
        
    }
}