class Solution {
    public int mirrorDistance(int n) {
    int a=n,i=0;
    while(n>0){
        i=n%10+i*10;
        n/=10;
    }   
    if(n<0)
    return -1*i; 
    return Math.abs(a-i);
    }
}