class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] res = new int[nums.length];
        int p = nums.length - 1;
    	while(start <= end) {
            int startSq = nums[start] * nums[start];
            int endSq = nums[end] * nums[end];
            if(startSq > endSq) {
                res[p] = startSq;
                start++;
            }else {
                res[p] = endSq;
                end--;
            }
            p--;
        }
        return res;
    }
}