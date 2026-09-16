class Solution {
    public int differenceOfSums(int n, int m) {
       int a=0,b=0;
       a=n*(n+1)/2;
       b=n/m;
       return a-2*m*b*(b+1)/2;
    }
}