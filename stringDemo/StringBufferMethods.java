package stringDemo;
public class StringBufferMethods {
    public static void main(String args[]) {
        StringBuffer sb1 = new StringBuffer(); // initial capacity 16
        System.out.println(sb1.capacity()); // 16
        sb1.append("abcdefghijklmnop"); // total 16 character so capacity has not been increased
        System.out.println(sb1.capacity()); // 16
        sb1.append('q'); // for addition of 1 single character, capacity will increased to (16+1)2=34
        System.out.println(sb1.capacity()); // 34

        StringBuffer sb2 = new StringBuffer(5); // creates an empty String with capacity 5
        System.out.println(sb2.capacity()); // 5
        sb2.append("Goutam Dam is learning");// increased capacity = (5+1)2=12
        // till "Goutam Dam i", after that extra charcters will be added to the
        // capacity, "s learning" = 10 character, so new capacity = 12+10=22

        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer("sachin"); // creates an StringBuffer object
        // with capacity length of the string ("sachin"+16)=6+16=22
        System.out.println(sb3.capacity()); // 22

        StringBuffer sb4 = new StringBuffer("sachinrameshtendulkar"); // total 22 character
        System.out.println(sb4.capacity()); // capacity = 22+16=37
        System.out.println(sb4.charAt(20));// r
        // System.out.println(sb.charAt(100));// StringIndexOutOfBoundException
        sb4.setCharAt(3, 'H'); // remove 3rd character= 'h' and replace with 'H'
        System.out.println(sb4);

        StringBuffer sb5 = new StringBuffer();
        sb5.append("PI Value is :: "); // append string
        sb5.append(3.1414); // append double value, float,long,integer can also be append
        sb5.append(" This is exactly "); // append string
        sb5.append(true); // append boolean value
        System.out.println(sb5);

        StringBuffer sb6 = new StringBuffer("SACIN");
        sb6.insert(3, 'H'); // insert 'H' in 3rd index and shift the remaining
        // characters towards right
        System.out.println(sb6);
        // sb6.insert(7, "IND"); StringIndexOutOfBoundException, offset should be within
        // string length().
        sb6.insert(6, "IND");
        System.out.println(sb6);
        sb6.insert(6, "Played for"); // insert the string in 6th index and shift
        // the remaining characters towards right
        sb6.insert(6, 1973); // insert integer value, float,long,integer can also be inserted
        sb6.insert(23, true); // insert boolean value
        System.out.println(sb6);

        StringBuffer sb7 = new StringBuffer("sachinrameshtendulkar");
        System.out.println(sb7);
        System.out.println(sb7.length()); // find the number of characters
        System.out.println(sb7.indexOf("ramesh")); // same as string method
        sb7.delete(6, 12); // from 6th index to 11th index get deleted
        System.out.println(sb7);
        sb7.deleteCharAt(13); // delete 13th character = 'a'
        System.out.println(sb7);
        sb7.reverse(); // reverse the string
        System.out.println(sb7);
        sb7.setLength(6); // reduced the string length to 6 character starts froM left
        // and removes the remaining characters
        System.out.println(sb7);

        StringBuffer sb8 = new StringBuffer(1000);
        System.out.println(sb8.capacity());
        sb8.append("sachin"); // 1000-6=994 capacity can be deallocate
        System.out.println(sb8.capacity());
        sb8.trimToSize(); // 994 capacity has been deallocated
        System.out.println(sb8.capacity()); // 6
        sb8.ensureCapacity(500); // capacity increased to 500
        System.out.println(sb8.capacity());

    }

}
