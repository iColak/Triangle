import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of digits : ");
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int h = 1; h <= (n - i); h++) {
                System.out.print(" ");
            }
            for (int g = (2 * i) - 1; g >= 1; g--) {

                System.out.print("*");
            }
            System.out.println();

        }

    }
}
