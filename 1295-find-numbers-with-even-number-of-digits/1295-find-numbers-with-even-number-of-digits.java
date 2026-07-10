class Solution {
    public int findNumbers(int[] nums) {
     int a=0;
     for(int i=0;i<nums.length;i++){
       if(nums[i]>9&&nums[i]<100){
        a+=1;
       }
       else if(nums[i]>999&&nums[i]<10000){
        a+=1;
       }
       else if(nums[i]==100000)
       a+=1;
      
     }   
     return a;
    }
}