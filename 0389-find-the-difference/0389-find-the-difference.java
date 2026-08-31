class Solution {
    public char findTheDifference(String s, String t) {
      char c=0;
       for(int i:s.toCharArray()){
            c^=i;
        }
        for(int i:t.toCharArray()){
            c^=i;
        }
        
        return c; 
    }
}