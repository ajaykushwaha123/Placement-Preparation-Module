class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
         if(nums.length%k != 0){
            return false;
        }
        TreeMap<Integer,Integer>tm = new TreeMap<>();
        for(int crd:nums){
            if(tm.containsKey(crd)){
                tm.put(crd,tm.get(crd)+1);
            }
            else{
                tm.put(crd,1);
            }
        }
        for(int key:tm.keySet()){
            int keyval = tm.get(key);
            if(keyval>0){
                for(int i=0;i<k;i++){
                    
                    if(tm.containsKey(key+i) && tm.get(key+i)>=keyval){
                        
                        tm.put(key+i,tm.get(key+i)-keyval);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}