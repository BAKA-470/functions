import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:  ");
        float r  = input.nextFloat();
        float ans = cir(r);
        float ans2 = area(r);
        System.out.println("The area of the circle with radius " + r + " is " + ans2 + " and it's circumference is " +ans);
    }

    static float area(float r) {
        return (float) (Math.PI * r * r);
    }

    static float cir(float r) {
        return (float) (2 * Math.PI * r);
    }
}
