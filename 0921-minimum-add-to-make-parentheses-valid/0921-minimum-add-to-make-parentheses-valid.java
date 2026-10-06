class Solution {
    public int minAddToMakeValid(String s) {
       int p=0,r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            p++;
            else{
                if(p>0)
                p--;
                else
                r++;
            }
        }
        return r+p;
    }
}
//note that this question contains only '(',')'.therefore we need not write solution for the other types.this solutions explains that for each characterif the opening bracket is present we need to increment the count variable and else if the count is greater than 0 then we need to decrement since we dont want negative values else we take a new variable and increment it bcs there is no open parenthesis for this character.therefore it is an invalid and we increment the result variable.now return the sum of these both variables.