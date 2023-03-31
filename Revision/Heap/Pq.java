import java.util.PriorityQueue;

class Solution {
    static class Row implements Comparable<Row> {
        int soldier;
        int idx;

        // constructor
        public Row(int soldier, int idx) {
            this.soldier = soldier;
            this.idx = idx;
        }

        // comaprable funtion
        @Override
        public int compareTo(Row r2) {
            if (this.soldier == r2.soldier) {
                return this.idx - r2.idx;
            } else {
                return this.soldier - r2.soldier;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = { { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };
        int k = 3;
        int n = mat1.length;
        int ans[] = new int[n];

        PriorityQueue<Row> pq = new PriorityQueue<>();
        for (int i = 0; i < mat1.length; i++) {
            int count = 0;
            for (int j = 0; j < mat1[0].length; j++) {
                if (mat1[i][j] == 1) {
                    count++;
                }
            }
            pq.add(new Row(count, i));
        }

        // for (int i = 0; i < k; i++) {
        // Row r = pq.poll();
        // // ans[i] = r.idx;
        // // System.out.println(ans[i]);
        // }
        for (int i = k - 1; i >= 0; i--) {
            Row row = pq.poll();
            ans[i] = row.idx;
            System.out.println(ans[i]);
        }

    }

}