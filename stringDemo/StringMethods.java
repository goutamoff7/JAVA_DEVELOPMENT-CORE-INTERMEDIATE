package stringDemo;
class StringMethods {
    public static void main(String args[]) {
        String s = "GOUTAM DAM DAM DAM";
        String s1 = "GOUTAM DAM DAM DAM";
        System.out.println(s.lastIndexOf('D'));
        System.out.println(s.lastIndexOf('D', 12));
        System.out.println(s.lastIndexOf("DAM"));
        System.out.println(s.lastIndexOf("DAM", 9));
        System.out.println(s.lastIndexOf("DAM", 14));

        System.out.println(String.valueOf(556).length());
        System.out.println(String.valueOf(55.6f).length());
        System.out.println(String.valueOf(55.6).length());
        long l = 556;
        System.out.println(String.valueOf(l).length());
        System.out.println(String.valueOf('d').length());
        System.out.println(String.valueOf(true).length());
        char data[] = { '1', 'c', 'd', '8' };
        System.out.println(String.valueOf(data).length());
        System.out.println(String.valueOf(new Object()));
        System.out.println(String.valueOf(new StringMethods()));
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(s.startsWith("G"));
        System.out.println(s.startsWith("A"));
        System.out.println(s.startsWith("DA", 7));
        System.out.println(s.startsWith("DA", 8));
        System.out.println(s.startsWith(""));
        System.out.println(s.startsWith("GOUTAM DAM DAM DAM"));
        System.out.println(s.endsWith("M"));
        System.out.println(s.endsWith("G"));
        System.out.println(s.endsWith("AM"));
        System.out.println(s.endsWith(""));
        System.out.println(s.endsWith("GOUTAM DAM DAM DAM"));

    }
}