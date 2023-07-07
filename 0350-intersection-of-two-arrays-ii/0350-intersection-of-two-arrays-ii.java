class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        	ArrayList<Integer> ans = new ArrayList<>();
		Map<Integer, Integer> freq = new HashMap<>();

		for(int i=0;i<nums1.length;i++) {
			if(!freq.containsKey(nums1[i]))
				freq.put(nums1[i], 1);
			else
				freq.put(nums1[i], freq.get(nums1[i]) + 1);
		}
		for(int i=0;i<nums2.length;i++) {
			if(freq.containsKey(nums2[i]) && freq.get(nums2[i]) > 0) {
				freq.put(nums2[i], freq.get(nums2[i]) - 1);
				ans.add(nums2[i]);
			}
		}
		int n = ans.size();
		int[] res = new int[n];
		for(int i=0;i<n;i++) {
			res[i] = ans.get(i);
		}
		return res;
        
    }
}