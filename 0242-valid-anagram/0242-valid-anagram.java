class Solution {
    public boolean isAnagram(String s, String t) {
        char a1[] = s.toCharArray();
        char a2[] = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1,a2);
//         HashMap<Character,Integer> map = new HashMap<>();
//         for( int i = 0; i < s.length() ; i++){
//             if( map.containsKey(s.charAt(i))){
//             map.put(s.charAt(i) , map.get(s.charAt(i)) + 1);
//         }
          
//     }
//                 for( int i = 0; i < t.length() ; i++){
//             if( map.containsKey(t.charAt(i))){
//             map.put(s.charAt(i) , map.get(s.charAt(i)) - 1);
//             }
//                for( int val : map.values()){
//                    if(val != 0){
//                        return false;
//                    }
//                }
               
// }
//         return true;
    }
}