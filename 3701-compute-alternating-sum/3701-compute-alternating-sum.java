class Solution {
    public int alternatingSum(int[] nums) {
      int c=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                c+=nums[i];
            }
            else{
                c-=nums[i];
            }
        }
        return c;
    }
}