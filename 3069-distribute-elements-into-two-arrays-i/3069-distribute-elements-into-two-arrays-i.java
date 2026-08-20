import java.util.*;
class Solution {
    public int[] resultArray(int[] nums) {
     int n=nums.length;
     int[] c=new int[n];
     List<Integer> list1=new ArrayList<>();
     List<Integer> list2=new ArrayList<>();
     list1.add(nums[0]);
     list2.add(nums[1]);
     for(int i=2;i<n;i++){
        int last1=list1.get(list1.size()-1);
        int last2=list2.get(list2.size()-1);
        if(last1>last2){
            list1.add(nums[i]);
        }
        else{
            list2.add(nums[i]);
        }
     } 
     int a=0;
     for(int i=0;i<list1.size();i++){
        c[a++]=list1.get(i);
     }
     for(int i:list2){
        c[a++]=i;
     }
     return c;  
    }
}