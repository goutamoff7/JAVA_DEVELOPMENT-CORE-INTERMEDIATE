import java.util.Arrays; 
public class Problem4 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0.0;
		int m=nums1.length;
		int n=nums2.length;
		int merged[]=new int[m+n],j=0;
		for(int val:nums1)
			merged[j++]=val;
		for(int val:nums2)
			merged[j++]=val;
		Arrays.sort(merged);
		if((n+m)%2==0)
			median=(double)((merged[(n+m)/2]+merged[((n+m)/2)-1]))/2;
		else	
			median=(merged[(n+m)/2]);
		return median;
	}

	public static void main(String[] args) {
		int num1[] = { 1, 3 };
		int nums2[] = { 2 };
		System.out.println(new Problem4().findMedianSortedArrays(num1, nums2));
	}
}
