/*
 * 2951. Find the Peaks
 * Input: mountain = [1,4,3,8,5]
 * Output: [1,3]
 * Explanation: mountain[0] and mountain[4] can not be a peak
 * because they are first and last elements of the array.
 * mountain[2] also can not be a peak
 * because it is not strictly greater than mountain[3] and mountain[1].
 * But mountain [1] and mountain[3] are strictly greater than their neighboring
 * elements.
 * So the answer is [1,3].
 */

import java.util.List;
import java.util.ArrayList;

class Problem2951 {
	public List<Integer> findPeaks(int[] mountain) {
		List<Integer> res = new ArrayList<Integer>();
		int n = 0;
		for (int i = 1; i < mountain.length - 1; i++) {
			if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1])
				res.add(n++, i);
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new Problem2951().findPeaks(new int[] { 1, 4, 3, 8, 5 }));

	}
}