import java.util.Scanner;

class FindIndex_Array {
    public static void main(String[] args) {
        int ar[] = { 5, 6, 8, 9, 4 };
        Scanner read = new Scanner(System.in);
        System.out.print("Enter any number from {5,6,8,9,4} to find its index: ");
        int findIndex = read.nextInt();
        int flag = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == findIndex) {
                System.out.println("Index of " + findIndex + ": " + i);
                flag = 1;
                break;

            }
        }
        if (flag == 0)
            System.out.println("Index of " + findIndex + " is not found");
    }
}
