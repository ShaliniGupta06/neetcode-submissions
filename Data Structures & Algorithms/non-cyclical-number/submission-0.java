class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        while(true){
            n = sumOfSquares(n);
            if(n == 1) return true;
            else if(!set.contains(n)) set.add(n);
            else return false;
        }
    }
    private int sumOfSquares(int n){
        int sum = 0;
        while(n > 0){
            int d = n % 10;
            sum += d*d;
            n /= 10;
        }
        return sum;
    }
}
