import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());

        char c = 'a';
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(c + " ");
                c++;
            }
            c = 'a';
            System.out.println();
        }

        for (int i = n - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                System.out.print(c + " ");
                c++;
            }
            c = 'a';
            System.out.println();
        }
    }
}
