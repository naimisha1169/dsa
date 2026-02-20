class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int[] arr=new int[128];
        int max=0;
        for(int i=0;i<s.length();i++){
            char cc=s.charAt(i);
            arr[cc]++;
            while(arr[cc]>1){
                arr[s.charAt(left)]--;
                left++;
            }
            max=Math.max(max,i-left+1);
        }
return max;
    }
}