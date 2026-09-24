class Solution {
    public int smallestIndex(int[] nums) {
      int o=0;
       for(int i=0;i<nums.length;i++){
        int j=nums[i],sum=0;
        while(j>0){
            sum+=j%10;
            j/=10;
        }
        if(sum==i){
        o=i;
        break;
       }
        else o=-1;
       }
       return o;
    }
}