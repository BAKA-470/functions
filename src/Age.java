import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int a = input.nextInt();
        String ans = eligible(a);
        System.out.println(ans);
    }
    static String eligible(int a){
        if(a <= 0){
            return "Congratulations on the baby but he needs proper knowledge to vote!!!!";
        }

        if(a >= 18){
            return "Eligible to vote";
        }else{
            return "Not eligible to vote, let the kid know the politics first!!!!";
        }
    }
}
