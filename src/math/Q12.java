public class Q12 {
    public static void main(String[] args) {
        Q12 s1 = new Q12();

        Solution s = s1.new Solution();
        System.out.println(s.intToRoman(9));

    }
    /**
     * 数字转为罗马表示
     * https://leetcode-cn.com/problems/integer-to-roman/
     */
    class Solution {
        private String[] roman = {"M", "CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        private int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        public String intToRoman(int num) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < nums.length; j++) {
                int temp = nums[j];
                while(num >= temp) {
                    builder.append(roman[j]);
                    num -= temp;
                }
            }
            return builder.toString();
        }
    }
}
