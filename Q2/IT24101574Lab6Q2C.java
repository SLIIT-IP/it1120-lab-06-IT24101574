import java.util.Scanner;

public class IT24101574Lab6Q2C {
    public static void main(String[] args) {
        int count, num;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        count = 0;

        while (count < 10) {
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = scanner.nextInt();
            sum = sum + numbers[count];
            count++;
        }

        System.out.println("The numbers you entered are: ");
        for (num = 0; num < 10; num++) {
            System.out.print(numbers[num] + " ");
        }
        System.out.println();

        double average = (double) sum / 10; 
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}