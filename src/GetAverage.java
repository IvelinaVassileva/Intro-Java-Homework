import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        double average = (a + b + c)/3d;
        System.out.printf("%.2f", average);
    }
}
