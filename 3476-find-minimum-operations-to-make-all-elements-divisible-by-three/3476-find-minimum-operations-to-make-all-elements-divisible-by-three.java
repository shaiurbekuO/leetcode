class Solution {
    public int minimumOperations(int[] nums) {
       int sum = 0;
       for(int num : nums){
            if(num%3 != 0){
            sum++;
            }
        }
        return sum;
    }
}