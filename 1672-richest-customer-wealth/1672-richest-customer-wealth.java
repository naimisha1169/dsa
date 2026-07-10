class Solution {
    public int maximumWealth(int[][] accounts) {
        int l=0,a=0;
        while(l<accounts.length){
            int r=0,c=0;
            while(r<accounts[0].length){
           c+=accounts[l][r];
           
            r++;
            }
             a=Math.max(a,c);
            l++;
        }
        return a;
    }
}