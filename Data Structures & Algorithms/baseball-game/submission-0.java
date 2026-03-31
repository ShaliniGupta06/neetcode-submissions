class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<>();
        for(int i = 0; i < operations.length; i++){
            String s = operations[i];
            int l = record.size();
            if(s.equals("+")){
                record.add(record.get(l-1)+record.get(l-2));
            }else if(s.equals("D")){
                record.add(2*record.get(l-1));
            }else if(s.equals("C")){
                record.remove(record.get(l-1));
            }else{
                record.add(Integer.parseInt(s));
            }        
        }
        int sum = 0;
        for(int n : record){
            sum += n;
        }
        return sum;
    }
}