class Solution {
    public static List<String> generate(String s, int start, int end, ArrayList<String> list){
        if(start == 0 && end == 0){
            list.add(s);
            return list;
        }
        if(start !=0){
            generate(s+"(",start-1,end,list);
        }
        if(end > start){
            generate(s+")",start,end-1,list);
        }
        
            return list;
    }
    
    public List<String> generateParenthesis(int n) {
        return generate("",n,n,new ArrayList<>());
    }
}