class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sent : sentences){
            String[] word = sent.split(" ");
            if(word.length>max) max = word.length;
        }
        return max;
        
    }
}