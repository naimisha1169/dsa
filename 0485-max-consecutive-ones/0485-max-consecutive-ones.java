class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      int l=0,r=0,c=0;
       while(l<nums.length){
        if(nums[l]==1){
            c++;
        }
        else{
            c=0;
        }
        r=Math.max(c,r);
        l++;
       }
       return r;
    }
}