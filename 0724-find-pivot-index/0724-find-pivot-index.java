class Solution {
    public int pivotIndex(int[] nums) {
        int[] p=new int[nums.length];
        int o=-1;
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++){
          p[i]=nums[i]+p[i-1];
        }
        for(int i=0;i<nums.length;i++){
           if(i==0){
            if(p[p.length-1]-p[i]==0){
            o=i;
            break;
            }
           }
           else if(i==p.length-1){
            if(p[i-1]==0){
                o=i;
                break;
            }
           }
           else if(p[i-1]==p[p.length-1]-p[i]){
                o=i;
            break;
            }
            
        }
        return o;
    }
}