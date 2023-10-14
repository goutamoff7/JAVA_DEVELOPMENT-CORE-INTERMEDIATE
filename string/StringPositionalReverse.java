class StringPositionalReverse {
    public static void main(String[] args) {

        String s = new String("Think Twice");
        s = s + ' ';
        int start = 0;
        String posRevrs = new String();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = i - 1; j >= start; j--)
                    posRevrs += s.charAt(j);
                posRevrs += ' ';
                start = i + 1;
            }
        }
        System.out.println(posRevrs);
    }

}