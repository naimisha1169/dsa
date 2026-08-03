class Solution {
    public int hammingWeight(int n) {
        String s="";
        int a=0;
        while(n>0){
            int c=n%2;
            s+=c;
            n/=2;
        }
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            a++;
        }
      }
      return a;
    }
}