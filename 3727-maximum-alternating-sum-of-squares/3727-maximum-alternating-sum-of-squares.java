class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=(long)nums[i]*nums[i];
        }
        Arrays.sort(a);
        long ans=0;
        int p=(n+1)/2;
        for(int i=0;i<n;i++){
            if(i<p) ans+=a[n-i-1];
            else ans-=a[n-i-1];
        }
        return ans;
    }
}