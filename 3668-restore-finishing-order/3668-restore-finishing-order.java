class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
       Set<Integer> list=new HashSet<>();
       List<Integer> res=new ArrayList<>();
       for(int f:friends){
            list.add(f);
       }
       for(int i:order)
        if(list.contains(i))
        res.add(i);
    return res.stream().mapToInt(Integer::intValue).toArray();
    }
}