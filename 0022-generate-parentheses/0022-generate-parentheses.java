class Solution {
    public static void generate(String s, int open, int close,int total, List<String> ans){
        if(s.length() == 2*total){
            ans.add(s);
            return;
        }
        if(open < total){
            generate(s+"(",open+1,close,total,ans);
        }
        if(close < open){
            generate(s+")",open,close+1,total,ans);
        }
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
         generate("",0,0,n,ans);
             return ans;
    }
}