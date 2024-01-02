public class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        // Example usage or testing
        int[] nums = {0, 2, 1, 5, 3, 4};
        Solution solution = new Solution();
        int[] result = solution.buildArray(nums);

        // Print or use the result as needed
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}