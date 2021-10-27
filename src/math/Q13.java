import java.util.HashMap;
import java.util.Map;

public class Q13 {
    public static void main(String[] args) {
        Q13 s1 = new Q13();

        Solution s = s1.new Solution();
        System.out.println(s.romanToInt("LVIII"));
        

    }
    /**
     * 13. 罗马转数字
     * https://leetcode-cn.com/problems/roman-to-integer/
     */
    class Solution1 {
        private String[] roman = {"M", "CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        private int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        public int romanToInt(String s) {
            int value = 0;
            while (!"".equals(s)) {
                for (int i = 0; i < roman.length; i++) {
                    String temp = roman[i];
                    if (s.startsWith(temp)) {
                        value += nums[i];
                        s = s.substring(temp.length());
                    }
                }
            }
            return value;
        }
    }
    
    
    class Solution {

        public int romanToInt(String s) {
            int value = 0;
            for (int i = 0; i < s.length(); i++) {
                Character ch = s.charAt(i);
                int pre = symbolValues.get(ch);
                if(i < s.length() -1  && pre < symbolValues.get(s.charAt(i+1))) {
                    value -= pre;
                }else {
                    value += pre;
                }
            }
            return value;
        }

        Map<Character, Integer> symbolValues = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
    }
}
