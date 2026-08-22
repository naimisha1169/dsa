class Solution {
    public boolean checkDivisibility(int n) {
       int i=0,j=0,sum=0,product=1,p=n;
       while(p>0){
        int d=p%10;
        sum+=d;
        product*=d;
        p/=10;
       }
        if(n%(sum+product)==0)
        return true;
        return false;
    }
}