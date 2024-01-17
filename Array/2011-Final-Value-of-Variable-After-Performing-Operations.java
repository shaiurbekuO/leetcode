import java.util.*;

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("X++") || operation.equals("++X")) {
                x = x + 1;
            } else if (operation.equals("X--") || operation.equals("--X")) {
                x = x - 1;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] operations = new String[n];
        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }
        System.out.println(solution.finalValueAfterOperations(operations));
    }
}
