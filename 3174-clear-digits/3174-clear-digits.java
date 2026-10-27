class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char  ch : s.toCharArray()){
            if(ch < 97 && !st.isEmpty()){
                st.pop();
            }else if(ch>=97){
                st.push(ch);
            }
        }
        String c="";
        for(char ch : st){
            c+=ch;

        }
        return c;
    }
}