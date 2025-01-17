class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       Set<Character> allowedSet = new HashSet<>();
       for(char ch : allowed.toCharArray()){
            allowedSet.add(ch);
       }

       int consistentCount = 0;
       for(String word : words){
        boolean isTure = true;
        for(char ch : word.toCharArray()){
            if(!allowedSet.contains(ch)){
                isTure = false;
                break;
            }
        }
        if(isTure){
            consistentCount++;
        }
       }
       return consistentCount;
    }
}