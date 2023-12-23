/* 2828. Check if a String Is an Acronym of Words
Input: words = ["alice","bob","charlie"], s = "abc"
Output: true
Explanation: The first character in the words "alice", "bob", and "charlie" 
are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem2828 {
    public boolean isAcronym(List<String> words, String s) {
        String[] ar = words.toArray(new String[words.size()]);
        String res = "";
        for (String n : ar) {
            res = res + n.charAt(0);
        }
        return (res.equals(s));

    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("alice","bob","charlie");
       System.out.println(new Problem2828().isAcronym(words,"abc"));
    }
}