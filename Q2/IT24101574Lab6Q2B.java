import java.util.Scanner;

public class IT24101574Lab6Q2B {
    public static void main(String[] args) {
	int count, num;

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        count = 0;

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = scanner.nextInt();
            count++;
        }

        System.out.println("The number you entered are: ");
	for (num = 0; num < 10; num++) {
    		System.out.print(numbers[num] + " ");
	}
	System.out.println();
    }
}