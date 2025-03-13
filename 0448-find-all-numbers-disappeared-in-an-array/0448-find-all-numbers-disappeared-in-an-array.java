class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }  
        List<Integer> res = new ArrayList<>();
        for(int i=1; i<=nums.length; i++){
            if(!numSet.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}