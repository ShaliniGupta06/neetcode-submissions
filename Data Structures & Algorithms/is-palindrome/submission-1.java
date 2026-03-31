class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder("");
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                st.append(Character.toLowerCase(ch));
            }
        }
        String str = st.toString();
        st.reverse();
        if(str.equals(st.toString())) return true;
        else return false;
    }
}
