class Solution {
    public int hammingWeight(int n) {
        String s="";
        int a=0;
        while(n>0){
            int c=n%2;
            s+=c;if(c==1)
            a++;
            n/=2;
        }
      return a;
    }
}