public class Solution { 
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] charArray = s.toCharArray();
        
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(charArray[right])) {
                right--;
            }
            while (left < right && !Character.isLetterOrDigit(charArray[left])) {
                left++;
            }
            char leftChar = Character.toLowerCase(charArray[left]);
            char rightChar = Character.toLowerCase(charArray[right]);
            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}