class Solution {
    public int getLucky(String s, int k) {
        int num = 0;
        for(char c : s.toCharArray()){
            int sum = c - 'a' + 1;
            while(sum > 0){
                num += sum % 10;
                sum = sum/10;
            }
        }
        for(int i = 1; i < k; ++i){
            int num1 = 0;
            while(num > 0){
                num1 += num % 10;
                num = num/10;
            }
            num = num1;
            
        }
        return num;
    }
}