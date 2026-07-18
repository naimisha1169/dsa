import java.util.*;
class Solution {
    public boolean isValid(String s) {
       Stack<Character> ss=new Stack<>();
       for(int i:s.toCharArray()){
        if(i=='(')
        ss.push(')');
        else if(i=='[')
        ss.push(']');
        else if(i=='{')
        ss.push('}');
        else if(i==')'||i=='}'||i==']'){
            if(ss.isEmpty()||ss.pop()!=i)
            return false;
        }
       } 
       return ss.isEmpty();
    }
}