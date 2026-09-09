class Solution {
    public int numIdenticalPairs(int[] nums) {
     int c=0;
     int[] freq=new int[101];
       for(int i=0;i<nums.length;i++){
       if(freq[nums[i]]>0){
        c+=freq[nums[i]];
        freq[nums[i]]++;
       }
       else{
        freq[nums[i]]=1;
       }
       } 
       return c;
    }
}