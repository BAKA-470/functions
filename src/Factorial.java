import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int num = input.nextInt();
        int res = fact(num);
        System.out.println(res);
    }
    static int fact(int a){
        if(a == 1 || a == 0){
            return 1;
        }

            return a * fact(a - 1);

    }
}
