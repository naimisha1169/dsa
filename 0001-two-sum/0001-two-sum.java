class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[i]=i;
                    arr[j]=j;
                }
            }
        }
        System.out.print(arr);
    }
}