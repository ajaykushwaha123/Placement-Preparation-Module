class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] chr = new int[26];
        for(int i=0;i<chars.length();i++)
        {
            chr[chars.charAt(i)-'a']++;
        }
        int cnt =0 ;
        for(String s : words)
        {
            if(check(s,chr))
                cnt+=s.length();
        }
        return cnt;
    }

    boolean check(String word, int[] chr)
    {
        int[] cnt = new int[26];
        for(int i =0;i<word.length();i++)
        {
            int x = word.charAt(i)-'a';
            cnt[x]++;
            if(cnt[x] > chr[x])
                return false;
        }
        return true;
    }
}