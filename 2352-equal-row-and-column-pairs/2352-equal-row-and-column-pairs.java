class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>, Integer> mp = new HashMap<>();
        int n=grid.length; 
        for(int i=0;i<n;i++){
            List<Integer> li=new ArrayList<>();
            for(int j=0;j<n;j++){
                li.add(grid[i][j]);
            }
             mp.put(li, mp.getOrDefault(li, 0) + 1);
        }
        int count=0;
          for(int i=0;i<n;i++){
            List<Integer> li=new ArrayList<>();
            for(int j=0;j<n;j++){
                li.add(grid[j][i]);
            }
           if (mp.containsKey(li)){
           count+=mp.get(li);
           }
        }
        return count;
    }
}