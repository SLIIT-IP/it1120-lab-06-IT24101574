import java.util.Scanner;

public class IT24101574Lab6Q1 {
    public static void main(String[] args) {
	double num, square, sqrt;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = scanner.nextDouble();

        square = num * num;
        sqrt = Math.sqrt(num);

        System.out.println("The square of " + num + " is : " + square);
        System.out.println("The square root of " + num + " is : " + sqrt);
    }
}
