class Solution {
    public int minimumPushes(String word) {
        int b = 0;
        if (word.length() < 9)
            return word.length();

        else {
            int a = word.length() / 8;
            b = (a * (a + 1) * 4) + (word.length() % 8) * (a + 1);
        }
        return b;
    }
}