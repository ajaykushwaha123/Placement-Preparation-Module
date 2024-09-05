class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < expression.length(); i++){
            char c = expression.charAt(i);
            if(c == '-' || c == '+' || c == '*'){
                String a = expression.substring(0,i);
                String b = expression.substring(i+1);
                List<Integer> al = diffWaysToCompute(a);
                List<Integer> bl = diffWaysToCompute(b);
                for(int x : al){
                    for(int y : bl){
                        if(c == '-'){
                            list.add(x-y);
                        }
                        else if(c == '+'){
                            list.add(x+y);
                        }
                        else if(c == '*'){
                            list.add(x*y);
                        }
                    }
                }
            }
        }
        if(list.size()==0)
            list.add(Integer.valueOf(expression));
        return list;
    }
}