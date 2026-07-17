import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> s=new Stack<>();
    for(String a:operations){
        if(a.equals("D"))
        s.push(s.peek()*2);
        else if(a.equals("C"))
        s.pop();
        else if(a.equals("+")){
        int d=s.pop();
        int b=s.pop();
        int c=d+b;
        s.push(b);
        s.push(d);
        s.push(c);
    }
        else 
        s.push(Integer.parseInt(a));
    }
    int i=0;
    while(!s.isEmpty()){
        i+=s.pop();
    }
return i;
    }
}