class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 100, max = 0;
        boolean[] present = new boolean[101];
        List<Integer> missing = new ArrayList<>();
        for (int x : nums) {
            if (x < min)
                min = x;
            if (x > max)
                max = x;
            present[x] = true;
        }
        for (int i = min + 1; i < max; i++) {

            if (!present[i])
                missing.add(i);
        }
        return missing;
    }
}