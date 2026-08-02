import java.util.*;
class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<>();
       for(int i:s.toCharArray()){
        if(i=='(')
        stack.push(')');
        else if(i=='[')
        stack.push(']');
        else if(i=='{')
        stack.push('}');
        else if(i==')'||i=='}'||i==']'){
            if(stack.isEmpty()||stack.pop()!=i)
            return false;
        }
       } 
       return stack.isEmpty();
    }
}
