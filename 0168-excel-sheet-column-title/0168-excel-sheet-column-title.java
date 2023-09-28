class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while(columnNumber > 0)
        {
            char ch = (char)('A' + ((columnNumber - 1) % 26));
            ans.append(ch);

            columnNumber = (columnNumber-1) / 26;
        }    

        ans.reverse();

        return ans.toString();
    }
}