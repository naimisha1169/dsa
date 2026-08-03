import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] c=new int[nums.length];
        for(int i=0;i<c.length;i++){
            c[i]=nums[i]*nums[i];
        }
        Arrays.sort(c);
        return c;
    }
}