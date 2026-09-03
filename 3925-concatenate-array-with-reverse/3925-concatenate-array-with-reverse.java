class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] a=new int[nums.length*2];
        for(int i=0;i<a.length;i++){
            if(i<nums.length){
                a[i]=nums[i];
            }
            else{
                a[i]=nums[nums.length-(i-nums.length)-1];
            }
        }
        return a;
    }
}