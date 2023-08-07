class Solution {
   public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        int ans = helper(rooms, visited, 0,n);
        return ans == n;
    }
    public int helper(List<List<Integer>> rooms, boolean[] visited, int curr, int n) {
        if(visited[curr]) {
            return 0;
        }
        visited[curr] = true;
        int ans = 1;
        for(int i = 0; i<rooms.get(curr).size(); i++) {
            List<Integer> keys = rooms.get(curr);
            ans += helper(rooms, visited, keys.get(i), n);
        }
        return ans;
    }
}