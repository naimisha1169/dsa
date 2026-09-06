class Solution {
    public int digitFrequencyScore(int n) {
       int sum=n%10;
        while(n>0){
            n/=10;
            sum+=n%10;
        }
        return sum;
    }
}