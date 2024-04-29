import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        //
        for (int i = (n); i >= 0; i--) {
            for (int k = 1; k <= (2 * i - 1); k++) {// Loop for printing asterisks
                System.out.print("*");
        }
            System.out.println(" ");
    }
}
}