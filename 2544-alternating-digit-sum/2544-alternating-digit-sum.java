class Solution {
    public int alternateDigitSum(int n) {
        int temp = n;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp !=0){
            list.add(temp%10);
            temp = temp/10;
        }
        Collections.reverse(list);
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            if(i % 2 == 0){
                sum += list.get(i);
            }
            else{
                sum = sum -  list.get(i);
            }
        }
        return sum;
    }
}