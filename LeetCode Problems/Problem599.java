import java.util.ArrayList;
import java.util.List;

class Problem599 {
	public String[] findRestaurant(String[] list1, String[] list2) {
		String ar[]=new String[list1.length+list2.length];
		int indexSum = Integer.MAX_VALUE, pos = 0;
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i].equals(list2[j])) {
					if ((i + j)<indexSum) {
						indexSum = i + j;
						ar[pos]=list1[i];
					}
					else if((i + j)==indexSum)
						ar[++pos]=list1[i];
				}
			}
		}
		List<String> list = new ArrayList<String>();
		for (String s:ar)
		{	
			if(s!=null)
			list.add(s);
		}
		String res[] = new String[list.size()];
		for(int i=0;i<list.size();i++)
			res[i]=list.get(i);
		return res;
	}

	public static void main(String[] args) {
		// String list1[] = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		// String list2[] = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter
		// Steakhouse", "Shogun" };
		String list1[] = {"Shogun","Piatti","Tapioca Express","Burger King","KFC"};
		String list2[] = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		String res[] = new Problem599().findRestaurant(list1, list2);
		for (String s : res)
			System.out.println(s + ",");
	}
}