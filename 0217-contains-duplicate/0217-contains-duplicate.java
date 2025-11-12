import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
     boolean p=false;
     Arrays.sort(nums);
     for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1])
        p=true;
     }   
     return p;
    }
}