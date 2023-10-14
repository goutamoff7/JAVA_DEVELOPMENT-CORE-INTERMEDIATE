class StringPositionalReverse2 {

    StringBuffer reverseString(String str) {
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        return s;
    }

    public static void main(String[] args) {

        String s1 = new String("Think Twice");
        String ar[] = s1.split(" ");
        StringBuffer s2 = new StringBuffer();
        for (int i = 0; i < ar.length; i++) {
            s2.append(new StringPositionalReverse2().reverseString(ar[i]));
            s2.append(" ");
        }
        System.out.println(s2);
    }
}