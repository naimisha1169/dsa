class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int a[]=new int[friends.length];
        int k=0;
        for(int i:order)
        {
            for(int j:friends)
            {
                if(i==j)
                {
                    a[k++]=i;
                    break;
                }
            }
        }
        return a;
    }
}