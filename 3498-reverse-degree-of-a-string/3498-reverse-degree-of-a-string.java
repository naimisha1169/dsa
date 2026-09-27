class Solution {
    public int reverseDegree(String s) {
       int c=0;
        for(int i=1;i<=s.length();i++){
            c+=(26-s.charAt(i-1)+'a')*i;
        }
        return c;
    }
}