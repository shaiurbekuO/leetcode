class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String tmp=words[i];
            for(int j=0;j<tmp.length();j++){
                if(tmp.charAt(j)==x){
                    ans.add(i);
                    break;
                }
            }
        }
        return ans;
    }
}