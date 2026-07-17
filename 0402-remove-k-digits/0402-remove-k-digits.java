class Solution {
    public String removeKdigits(String num, int k) {
      Stack<Character> s=new Stack<>();
      if(num.length()==k)
      return "0";
      int i=0;
      while(i<num.length()){
        char b=num.charAt(i);
        while(!s.isEmpty()&&k>0&&s.peek()>b){
        s.pop();
        k--;
        }
        s.push(b);
        i++;
       }
       while(k>0){
        s.pop();
        k--;
       }
       StringBuilder d=new StringBuilder();
       while(!s.isEmpty()){
        d.append(s.pop());
       }
       d.reverse();
       while(d.length()>1&&d.charAt(0)=='0'){
        d.deleteCharAt(0);
       }
       return d.length()==0?"0":d.toString();
    }
}