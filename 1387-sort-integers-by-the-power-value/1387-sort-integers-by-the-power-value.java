class Solution {
    public int getKth(int low, int high, int k) {
        List<Power> list = new ArrayList<>();
        while (low <= high) {
            int value = low;
            int power = 0;
            while (value != 1) {
                if (value % 2 == 0)
                    value /= 2;
                else
                    value = value * 3 + 1;
                power += 1;
            }
            list.add(new Power(low, power));
            low += 1;
        }
        Collections.sort(list, (a, b) -> a.power - b.power);
        return list.get(k-1).number;
    }
}
class Power {
    int number;
    int power;
    public Power(int number, int power) {
        this.number = number;
        this.power = power;
    }
}