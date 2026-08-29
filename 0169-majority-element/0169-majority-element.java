class Solution {
    public int majorityElement(int[] nums) {
        int c = 0, vote = 0;
        for (int num : nums) {
            if (c == 0)
                vote = num;
            if (vote == num)
                c++;
            else
                c--;
        }
        return vote;
    }
}