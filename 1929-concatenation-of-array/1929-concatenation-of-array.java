class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length*2;
        int a[]=new int[n];
        for(int i=0;i<nums.length;i++){
            a[i]=nums[i];
            a[nums.length+i]=nums[i];
        }
        return a;
    }
}