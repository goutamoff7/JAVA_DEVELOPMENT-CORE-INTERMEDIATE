package leetCodeProblems;
/* 2942. Find Words Containing Character
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". 
Hence, we return indices 0 and 1*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem2942 {
	public List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < words.length; i++) {
			{
				if (words[i].indexOf(x) != -1) {
					list.add(i);
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println(new Problem2942().findWordsContaining(new String[]{"leet", "code"}, 'e'));
		
	}
}