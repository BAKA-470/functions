import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        String ans = che(a);
        System.out.println(ans);
    }

    static String che(int a) {
        if(a == 1){
            return "1 is neither prime nor composite";
        }
        if(a == 2 || a == 3){
            return "2 and 3 are prime";
        }else{
            for(int j = 2; j <= (int) (Math.sqrt(a)); j++){

                if(a % j == 0){
                    return "The number is composite";
                }
            }
            return "The number is prime";
        }

    }
}
