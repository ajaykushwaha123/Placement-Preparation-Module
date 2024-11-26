class Solution {
    public int findChampion(int n, int[][] edges) {
        int[] indegree = new int[n];
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            indegree[v]++;
        }
        int camp = -1;
        int count = 0;
        for(int i = 0; i < n ; i++){
            if(indegree[i] == 0){
                camp = i;
                count++;
                if(count > 1){
                    return -1;
                }
            }
        }
        return camp;
    }
}