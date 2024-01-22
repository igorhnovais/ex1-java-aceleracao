import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int x = keyboard.nextInt();

        System.out.println("");
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
