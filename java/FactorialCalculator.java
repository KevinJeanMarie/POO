import java.util.Scanner;

public class FactorialCalculator {

    // Factorielle avec boucle

    public static long factorialLoop(int n) {

        long result = 1;

        for (int i = 1; i <= n; i++) {

            result *= i;

        }

        return result;

    }

    // Factorielle récursive

    public static long factorialRecursive(int n) {

        if (n <= 1)
            return 1;

        return n * factorialRecursive(n - 1);

    }

    public static void main(String[] args) {

        int number;

        if (args.length > 0) {

            number = Integer.parseInt(args[0]);

        } else {

            System.out.print("Entrez un nombre: ");

            Scanner scanner = new Scanner(System.in);

            number = scanner.nextInt();

        }

        System.out.println("Factorielle (boucle): " + factorialLoop(number));

        System.out.println("Factorielle (récursive): " + factorialRecursive(number));

    }

}