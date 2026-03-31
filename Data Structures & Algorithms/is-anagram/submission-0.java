class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[27];
        int[] b = new int[27];
        for(char ch : s.toCharArray()){
            a[(int)(ch - 'a')]++;
        }
        for(char ch : t.toCharArray()){
            b[(int)(ch - 'a')]++;
        }
        for(int i = 1; i < 27; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
