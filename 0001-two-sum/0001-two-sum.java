class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
        
        // Массивди башынан карап чыгабыз
        for (int i = 0; i < nums.length; i++) {
            // Керектүү санды эсептейбиз
            int complement = target - nums[i];
            
            // Эгер "керектүү" санды мурда көргөн болсок, индекстерди кайтарыңыз
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Азыркы санды HashMap'ка кошобуз
            map.put(nums[i], i);
        }
        
        // Эгер эч кандай чечим табылбаса (бул маселе боюнча болбойт)
        throw new IllegalArgumentException("No solution found");
    }
}