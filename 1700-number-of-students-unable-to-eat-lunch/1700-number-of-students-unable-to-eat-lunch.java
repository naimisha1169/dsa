class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int c1 = 0, c2 = 0;
        for (int stu : students) {
            if (stu == 0)
                c1++;
            else
                c2++;
        }
        for (int sand : sandwiches) {
            if (sand == 0) {
                if (c1 != 0) {
                    c1--;
                } else
                    break;
            } else {
                if (c2 != 0) {
                    c2--;
                } else
                    break;
            }
        }
        return c1 + c2;
    }
}