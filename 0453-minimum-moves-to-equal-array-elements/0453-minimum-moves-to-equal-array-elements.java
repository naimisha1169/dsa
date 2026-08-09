class Solution {
    public int minMoves(int[] nums) {
        int s=nums[0],c=0;
        for(int i=1;i<nums.length;i++){
           s=Math.min(s,nums[i]);
        }
        for(int n:nums)
        c+=n-s;
        return c;
    }
}