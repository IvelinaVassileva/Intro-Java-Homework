import java.util.Scanner;

public class SumNumbersToN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
