class Solution {
    private int inc(int num, int tens){
        int digit = num / tens;
        if(digit % 10 == 9)
            return num - 9 * tens;
        return num + tens;
    }
    private int dec(int num, int tens){
        int digit = num / tens;
        if(digit % 10 == 0)
            return num + 9 * tens;
        return num - tens;
    }
    public int openLock(String[] D, String T) {
        HashSet<Integer> set = new HashSet<>();

        for(String s : D)
            set.add(Integer.parseInt(s));
        int t = Integer.parseInt(T);
        
        if(set.contains(0)) return -1;
        if(t == 0) return 0;

        Queue<Integer> que = new LinkedList<>();
        int size = 1;
        que.add(0);
        set.add(0);

        for(int depth = 1; size > 0; depth++){
            for(int i = size; i > 0; i--){
                int x = que.remove();
                size--;
                for(int j = 0; j < 4; j++){
                    int tens = (int)Math.pow(10, j);
                    int inc = inc(x, tens);
                    int dec = dec(x, tens);

                    if(!set.contains(inc)){
                        if(inc == t) return depth;
                        set.add(inc);
                        que.add(inc);
                        size++;
                    }
                    if(!set.contains(dec)){
                        if(dec == t) return depth;
                        set.add(dec);
                        que.add(dec);
                        size++;
                    }
                }
            }
        }
        return -1;
    }
}