class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i=s.length()-1;
        String ss="";
        while(s.charAt(i)!=' '&&i>=0){
            ss+=s.charAt(i);
            if(i==0){
                break;
            }
            i--;
         
        
        }
        return ss.length();
    }
}