class PrintsArray {
    int ar[] = new int[] { 18, 25, 63, 98, 74, 6, 3, 5, 4, 9, 78, 15 };

    public static void main(String[] args) {
        PrintsArray obj = new PrintsArray();
        for (int n : obj.ar)
            System.out.print(n + " ");

    }
}
