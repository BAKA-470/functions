import java.util.Scanner;

public class EveOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check is it is even or odd: ");
        int a = input.nextInt();
        String ans = eveodd(a);
        System.out.println(ans);

    }
    static String eveodd(int a){
        if (a % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }
}
