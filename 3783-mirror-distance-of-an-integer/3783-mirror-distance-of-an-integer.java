class Solution {
    public int mirrorDistance(int n) {
    int a=n,i=0;
    while(a>0){
        i=a%10+i*10;
        a/=10;
    }    
    return Math.abs(n-i);
    }
}