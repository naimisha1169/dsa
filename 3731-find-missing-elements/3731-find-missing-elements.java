class Solution {
    public List<Integer> findMissingElements(int[] nums) {
      Arrays.sort(nums);
      List<Integer> ans=new ArrayList<>();
      int e=nums[nums.length-1],i=0,c=nums[0];
      while(c<e){
        if(nums[i]==c){
            c++;
            i++;
            continue;
        }
        else{
            while(c<nums[i]){
                ans.add(c++);
            }
            i++;
            c++;
        }
      }  
      return ans;
    }
}