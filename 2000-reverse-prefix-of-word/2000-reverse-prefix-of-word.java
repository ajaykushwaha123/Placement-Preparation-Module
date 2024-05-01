class Solution {
    public String reversePrefix(String word, char ch) {
        int x=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                x=i;
                break;
            }
        }
        return reverse(word,x);
    }
        public static String reverse(String s,int k){
            char[] c = s.toCharArray();
            for(int i=0,j=k;i<(k+1)/2;i++,j--){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }
            return new String(c);
    }
}