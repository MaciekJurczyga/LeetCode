import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int number = 0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for (int i = 0; i < s.length()-1; i++){
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                number -= map.get(s.charAt(i));
           }
                else {
                    number += map.get(s.charAt(i));
            }

        }
        number += map.get(s.charAt(s.length()-1));
        return number;
    }
}