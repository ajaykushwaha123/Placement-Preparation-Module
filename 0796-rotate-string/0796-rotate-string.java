class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String add = s + s;
        return add.contains(goal);
    }
}