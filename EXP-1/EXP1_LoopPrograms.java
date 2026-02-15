import java.util.Scanner;

public class LabAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Multiplication Table");
        System.out.println("2. Factorial");
        System.out.println("3. Reverse Number");
        System.out.println("4. Fibonacci Series");
        System.out.println("5. Sum of Digits");
        System.out.println("6. Max and Min in Array");
        System.out.println("7. Prime Check");
        System.out.println("8. Palindrome Check");
        System.out.println("9. Matrix Traversal");
        System.out.println("10. Pattern Printing");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                for (int i = 1; i <= 10; i++)
                    System.out.println(n + " x " + i + " = " + (n * i));
                break;

            case 2:
                System.out.print("Enter number: ");
                n = sc.nextInt();
                long fact = 1;
                for (int i = 1; i <= n; i++)
                    fact = fact * i;
                System.out.println("Factorial = " + fact);
                break;

            case 3:
                System.out.print("Enter number: ");
                n = sc.nextInt();
                int rev = 0;
                while (n > 0) {
                    rev = rev * 10 + (n % 10);
                    n = n / 10;
                }
                System.out.println("Reverse = " + rev);
                break;

            case 4:
                System.out.print("Enter terms: ");
                n = sc.nextInt();
                int a = 0, b = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.print(a + " ");
                    int c = a + b;
                    a = b;
                    b = c;
                }
                break;

            case 5:
                System.out.print("Enter number: ");
                n = sc.nextInt();
                int sum = 0;
                while (n > 0) {
                    sum = sum + (n % 10);
                    n = n / 10;
                }
                System.out.println("Sum = " + sum);
                break;

            case 6:
                System.out.print("Enter size: ");
                int size = sc.nextInt();
                int[] arr = new int[size];

                System.out.println("Enter elements:");
                for (int i = 0; i < size; i++)
                    arr[i] = sc.nextInt();

                int max = arr[0];
                int min = arr[0];

                for (int i = 0; i < size; i++) {
                    if (arr[i] > max)
                        max = arr[i];
                    if (arr[i] < min)
                        min = arr[i];
                }

                System.out.println("Max = " + max);
                System.out.println("Min = " + min);
                break;

            case 7:
                System.out.print("Enter number: ");
                n = sc.nextInt();
                boolean prime = true;

                if (n <= 1)
                    prime = false;
                else {
                    for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                }

                if (prime)
                    System.out.println("Prime number");
                else
                    System.out.println("Not prime");
                break;

            case 8:
                System.out.print("Enter number: ");
                n = sc.nextInt();
                int temp = n;
                rev = 0;

                while (temp > 0) {
                    rev = rev * 10 + (temp % 10);
                    temp = temp / 10;
                }

                if (rev == n)
                    System.out.println("Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;

            case 9:
                int[][] matrix = new int[2][2];

                System.out.println("Enter 4 elements:");
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        matrix[i][j] = sc.nextInt();

                System.out.println("Matrix:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++)
                        System.out.print(matrix[i][j] + " ");
                    System.out.println();
                }
                break;

            case 10:
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print("*");
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
