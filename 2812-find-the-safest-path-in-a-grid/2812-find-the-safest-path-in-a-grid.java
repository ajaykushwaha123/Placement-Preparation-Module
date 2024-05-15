class Solution {
     final int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] matrix = new int[n][n];
        Queue<int[]> multiSourceQueue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid.get(i).get(j) == 1) {
                    multiSourceQueue.add(new int[]{i, j});
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = -1;
                }
            }
        }

        while (!multiSourceQueue.isEmpty()) {
            int size = multiSourceQueue.size();
            while (size-- > 0) {
                int[] curr = multiSourceQueue.poll();
                for (int[] d : directions) {
                    int di = curr[0] + d[0];
                    int dj = curr[1] + d[1];
                    int val = matrix[curr[0]][curr[1]];
                    if (isValidCell(matrix, di, dj) && matrix[di][dj] == -1) {
                        matrix[di][dj] = val + 1;
                        multiSourceQueue.add(new int[]{di, dj});
                    }
                }
            }
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        pq.add(new int[]{0, 0, matrix[0][0]});
        matrix[0][0] = -1;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            if (curr[0] == n - 1 && curr[1] == n - 1) {
                return curr[2];
            }
            for (int[] d : directions) {
                int di = d[0] + curr[0];
                int dj = d[1] + curr[1];
                if (isValidCell(matrix, di, dj) && matrix[di][dj] != -1) {
                    pq.add(new int[]{di, dj, Math.min(curr[2], matrix[di][dj])});
                    matrix[di][dj] = -1;
                }
            }
        }

        return -1;
    }

    private boolean isValidCell(int[][] matrix, int i, int j) {
        int n = matrix.length;
        return i >= 0 && j >= 0 && i < n && j < n;
    }
}