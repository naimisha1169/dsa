class Solution {
    public int digitFrequencyScore(int n) {
       int a=0,sum=0;
        while(n>0){
            a=n%10;
            sum+=a;
            n/=10;
        }
        return sum;
    }
}