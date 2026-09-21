class Solution {
    public String intToRoman(int num) {
        // Arrays ordered from largest value to smallest
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder toRoman = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            // Greedy match: take as many of the largest possible values as you can
            while (num >= values[i]) {
                toRoman.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return toRoman.toString();
    }
}
