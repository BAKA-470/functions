import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = input.nextInt();
        System.out.print("Enter number 2: ");
        int b = input.nextInt();
        System.out.print("Enter number 3: ");
        int c = input.nextInt();
        int ans = maxi(a,b,c);
        System.out.println(ans);
        int ans2 = mini(a,b,c);
        System.out.println(ans2);
    }
    static int maxi(int a, int b, int c){
        int largest = a;
        if(b>a){
            largest = b;

        }
        if (c > b) {
            largest = c;

        }
        return largest;
    }
    static int mini(int a, int b, int c){
        int lowest = a;
        if (b < a){
            lowest = b;
        }
        if(c<b){
            lowest = c;
        }
        return lowest;
    }
}
