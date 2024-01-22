import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int x = keyboard.nextInt();
        String parameter1 = "positivo";
        String parameter2 = "impar";

        if (x < 0) { parameter1 = "negativo"; }
        if (x/2 == 0 ) { parameter2 = "par"; }

        System.out.println(x +" é "+parameter2+" e "+parameter1+".");
    }
}
