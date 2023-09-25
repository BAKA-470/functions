import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int ans = multiply(a,b);
        System.out.println(ans);
    }

    static int multiply(int a,int b) {
        return a * b;
    }
}
