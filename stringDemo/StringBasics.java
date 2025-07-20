package stringDemo;

public class StringBasics {
    public static void main(String[] args) {

        System.out.println("String");

        String name1 = new String("Goutam");
        String name2 = "Goutam"; 
        System.out.println(name1 == name2); // Object reference are different, Output: false
        System.out.println("name1.hashCode(): "+name1.hashCode()); // 2138780691 
        System.out.println("name2.hashCode(): "+name2.hashCode()); // 2138780691 same both as the contents are same
        System.out.println("System.identityHashCode(name1): " + System.identityHashCode(name1)); // 798154996
        System.out.println("System.identityHashCode(name2): " + System.identityHashCode(name2)); // 868693306
        name2 = name2 + " Dam";
        System.out.println("name2.hashCode(): "+name2.hashCode()); // 668764643 concatenates creates new object
        

        System.out.println("StringBuffer");

        StringBuffer name3 = new StringBuffer("Goutam");
        System.out.println("name3.hashCode(): "+name3.hashCode()); // 989110044
        System.out.println("System.identityHashCode(name3): " + System.identityHashCode(name3)); // 989110044
        name3.append("dam");
        System.out.println("name3.hashCode(): "+name3.hashCode()); // 989110044 
        System.out.println("System.identityHashCode(name3): " + System.identityHashCode(name3)); // 989110044

        System.out.println("StringBuilder");

        StringBuilder name4 = new StringBuilder("Goutam");
        System.out.println("name4.hashCode(): "+name4.hashCode()); // 424058530
        System.out.println("System.identityHashCode(name3): " + System.identityHashCode(name4)); // 424058530
        name4.append("dam");
        System.out.println("name4.hashCode(): "+name4.hashCode()); // 424058530
        System.out.println("System.identityHashCode(name3): " + System.identityHashCode(name4)); // 424058530
    }
    
}
