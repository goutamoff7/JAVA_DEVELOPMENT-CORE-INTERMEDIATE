/*1422. Maximum Score After Splitting a String
Input: s = "011101"
Output: 5 
Explanation: 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3*/

class Problem1422 {
    public int maxScore(String s) {
        int max = 0, count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String left = s.substring(0, i + 1);
            for (int j = 0; j < left.length(); j++) {
                if (left.charAt(j) == '0')
                    count++;
            }
            String right = s.substring(i + 1, s.length());
            for (int k = 0; k < right.length(); k++) {
                if (right.charAt(k) == '1')
                    count++;

            }
            System.out.println(count);
            if (max < count)
                max = count;
            count = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max= " + new Problem1422().maxScore("011101"));
    }
}
