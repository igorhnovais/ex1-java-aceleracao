import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int x = keyboard.nextInt();
        
        System.out.println("Tabela de multiplicação por "+x);
        for(int i = 0; i <= 10; i++){
            int result = x * i;

            System.out.println(x+" x "+i+" = "+result);
        }
    }
}



