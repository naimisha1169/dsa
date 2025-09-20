class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        int l=0;
        boolean p=true;
        int r=s.length()-1;
       while(l<r){
       if( s.charAt(l)==s.charAt(r)){
    p=true;
    l++;
    r--;
       }
    else{
        p=false;
         break;
       }
       }
       return p;
    }
}