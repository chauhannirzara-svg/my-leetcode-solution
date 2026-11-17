class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hash = new HashSet<>();
        String s = "";
        
        for(int i = 0 ; i< paths.size(); i++){
            hash.add(paths.get(i).get(0));
        }
        for(int i =0 ; i < paths.size() ; i++){
            if(!hash.contains(paths.get(i).get(1))){
                s=paths.get(i).get(1);
            }
        }
        return s;
        
    }
}