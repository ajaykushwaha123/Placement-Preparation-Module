class Solution {
    public int[] sortByBits(int[] arr) {
      Map<Integer, List<Integer>> D = new HashMap<>();

        for (int i : arr) {
            int count = Integer.bitCount(i);
            D.putIfAbsent(count, new ArrayList<>());
            D.get(count).add(i);
        }

        List<Integer> result = new ArrayList<>();
        List<Integer> sortedKeys = new ArrayList<>(D.keySet());
        Collections.sort(sortedKeys);

        for (int k : sortedKeys) {
            List<Integer> sortedValues = D.get(k);
            Collections.sort(sortedValues);
            result.addAll(sortedValues);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}