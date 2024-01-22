import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int x = keyboard.nextInt();
        System.out.println("");

        int num1 = 1;
        int num2 = 0;
        
        System.out.print(num2+ " ");
        System.out.print(num1+ " ");
        
        for(int i = 0; i < x-2; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.print(num1 + " ");
        }
        System.out.println("");
    }
};

