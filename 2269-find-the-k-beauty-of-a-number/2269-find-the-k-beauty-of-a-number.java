class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=""+num;
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String s2=str.substring(i, j);
                if(s2.length()==k){
                    int x=Integer.parseInt(s2);
                    if(x!=0&&num%x==0){
                        count++;
                    }
                }
                else if(s2.length()>k){
                    break;
                }
                
            }
        }
        return count;
    }
}