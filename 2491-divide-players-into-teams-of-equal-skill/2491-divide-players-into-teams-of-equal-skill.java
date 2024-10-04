class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);

        long sum = skill[0] + skill[n-1];
        long res = skill[0] * skill[n-1];

        for(int i=1, j=n-2; i<j; i++, j--) {
            if(skill[i] + skill[j] == sum){
                res += skill[i] * skill[j];
            }
            else 
            return -1;
        }
        return res;
    }
}