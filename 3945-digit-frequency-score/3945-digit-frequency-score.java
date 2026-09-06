class Solution {
    public int digitFrequencyScore(int n) {
       int a=0,sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}