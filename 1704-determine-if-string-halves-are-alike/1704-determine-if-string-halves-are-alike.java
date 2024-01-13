class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.toLowerCase();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < a.length()/2; i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u' ){
                count1++;
            }
        }
        for(int i = a.length()/2; i < a.length(); i++){
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'  ){
                count2++;
            }
        }
        return count1 == count2;
    }
}