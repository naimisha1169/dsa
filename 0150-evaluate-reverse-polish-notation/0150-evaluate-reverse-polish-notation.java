class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s=new Stack<>();
        int a=0,b=0;
        for(String c:tokens){
            if(c.equals("+")){
                a=s.pop();
                b=s.pop();
                s.push(b+a);
            }
            else if(c.equals("-")){
                a=s.pop();
                b=s.pop();
                s.push(b-a);
            }
             else if(c.equals("/")){
                a=s.pop();
                b=s.pop();
                s.push(b/a);
            }
             else if(c.equals("*")){
                a=s.pop();
                b=s.pop();
                s.push(b*a);
            }
            else 
            s.push(Integer.parseInt(c));
        }
        return s.peek();
    }
}