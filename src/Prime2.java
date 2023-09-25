import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter at least a 2 digit number:  ");
        int num = input.nextInt();
        String ans = che(num);
        System.out.println(ans);

    }

    static String che(int num) {
        int temp = num;
        int a = 0;
        while(temp > 0){
            int n = temp % 10;
            temp /= 10;
            a = a * 10 + n;
        }
        if(a == num){
            return "The number is a palindrome";
        }
        else{
            return "The number is not palindrome";
        }
    }
}