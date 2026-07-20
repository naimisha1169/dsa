class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] a = new int[grid.length * grid[0].length];
        int b = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                a[b++] = grid[i][j];
            }
        }
           k=k%a.length;
             int l = a.length-k,r=a.length-1;
            while (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
             l = 0;r = a.length - k-1;
            while (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
             l = 0; r = a.length - 1;
            while (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        
        List<List<Integer>> list = new ArrayList<>();
        int i=0;
       while(i<a.length) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < grid[0].length; j++) {
                row.add(a[i++]);

            }

            list.add(row);

        }
        return list;
    }
}