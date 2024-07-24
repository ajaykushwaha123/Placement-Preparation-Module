class Solution {
    public int[][] updateMatrix(int[][] mat) {
         int n = mat.length, m = mat[0].length;
        int i = 0 , j = 0;
        int[][] dis = new int[n][m];
        for(int [] ar : dis)
            Arrays.fill(ar,Integer.MAX_VALUE);
        Queue<Pair<Pair<Integer,Integer>,Integer>> queue = new LinkedList<>();
        for(i = 0 ; i < n ; i++ ){
            for(j = 0 ; j < m ; j++ ){
                if(mat[i][j] == 0)
                    queue.add(new Pair(new Pair(i,j), 0 ));
            }
        }
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        
        while( !queue.isEmpty() ){
            int r = queue.peek().getKey().getKey();
            int c = queue.peek().getKey().getValue();
            int dist = queue.peek().getValue();
            queue.poll();
            if( dist < dis[r][c] ){
                dis[r][c] = dist;
                for(i = 0 ; i < 4; i++){
                    int nr = r + dr[i];
                    int nc = c + dc[i];
                    if(nr >=0 && nr < n && nc >= 0 && nc < m && dis[nr][nc] > dist ){
                        int dd = dist+1;
                        queue.add(new Pair(new Pair(nr,nc), dd) );
                    }
                }
            }
            
            
        }
        return dis;
    }
}