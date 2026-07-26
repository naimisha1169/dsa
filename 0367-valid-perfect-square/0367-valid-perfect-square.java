class Solution {
    public boolean isPerfectSquare(int num) {
       boolean b=false;
       long x=(long)Math.sqrt(num);
       if(num==1){
        return true;
       }
       if(x*x==num)
        return true;
        return false;
    }
}