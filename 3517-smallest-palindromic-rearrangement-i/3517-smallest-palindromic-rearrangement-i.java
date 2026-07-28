class Solution {
    public String smallestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        char[] a = new char[s.length()];
        Arrays.fill(a, '~');
        for (int j = 0; j < s.length() / 2; j++) {
            a[j] = s.charAt(j);

        }
        Arrays.sort(a);
        a[s.length() / 2] = s.charAt(s.length() / 2);
        int b=(s.length()/2)-1;
            if (s.length() % 2 != 0) {
                for (int i = (s.length() / 2)+1; i < s.length(); i++) {
                    a[i]=a[b];
                    b--;
                }
            } else {
                for (int i = (s.length() / 2); i < s.length(); i++) {
                    a[i]=a[b];
                    b--;
                }
            }
        return new String(a);
    }
}