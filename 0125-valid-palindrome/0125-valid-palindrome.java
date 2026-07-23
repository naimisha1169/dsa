import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        List<Character> list =new ArrayList<>();
        while(i<s.length()){
            if(Character.isLetterOrDigit(s.charAt(i))){
                list.add(s.charAt(i));
            }
            i++;
        }
       List<Character> list1=new ArrayList<>(list.reversed());
        return list.equals(list1);
    }
}