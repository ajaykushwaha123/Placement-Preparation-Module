class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] answer = new boolean[queries.length];
		int[] check = new int[nums.length];
		int count = 0;
		
		for(int j = 0; j < nums.length-1; j++)
		{
			if(!((nums[j] % 2 == 0 && nums[j+1] % 2 == 1) || (nums[j] % 2 == 1 && nums[j+1] % 2 == 0)))
			{
				count++;
			}
			check[j+1] = count;
		}
		
		for(int i = 0; i < queries.length; i++)
		{
			if(check[queries[i][0]] == check[queries[i][1]]) answer[i] = true;
		}
        return answer;
    }
}