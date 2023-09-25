import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static  int sum(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        return num1 + num2;

    }
}