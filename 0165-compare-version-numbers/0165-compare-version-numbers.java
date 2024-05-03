class Solution {
    public int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;
        int dig1=0;
        int dig2=0;
        while(i<version1.length() || j<version2.length())
        {
            while(i<version1.length() && version1.charAt(i)!='.')
            {
                dig1=dig1*10+(version1.charAt(i)-'0');
                i++;
            }
             while(j<version2.length() && version2.charAt(j)!='.')
            {
                dig2=dig2*10+(version2.charAt(j)-'0');
                j++;
            }
            if(dig1<dig2)return -1;
            else if(dig1>dig2)return 1;

            dig1=0;
            dig2=0;
            j++;
            i++;


        }
        return 0;
    }
}