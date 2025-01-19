class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        for(char c : s.toCharArray()){
            if(c == 'R'){
                balance++;
            }else if(c == 'L'){
                balance--;
            }

            if(balance == 0){
                count++;
            }
        }
        return count;
    }
}