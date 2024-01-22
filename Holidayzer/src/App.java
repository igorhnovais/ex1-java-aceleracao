import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String[] datas = {"01-01-2024", "12-02-2024", "13-02-2024", "29-03-2024", "21-04-2024", "01-05-2024", "30-05-2024", "07-09-2024", "12-10-2024", "02-11-2024", "15-11-2024", "20-11-2024", "25-12-2024"};
        String[] names = {"Confraternização Mundial", "Carnaval", "Carnaval", "Sexta-feira Santa", "Tiradentes", "Dia do Trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Dia Nacional de Zumbi e da Consciência Negra", "Natal"};
        
        ArrayList<Holidayzer> list = new ArrayList<Holidayzer>();
        
        for (int i = 0; i < datas.length; i++) {
            Holidayzer p = new Holidayzer(datas[i], names[i]);
            list.add(p);
        }
        
        int x = 0;
        do {

            System.out.println("1 - Lista de todos os feriados.");
            System.out.println("2 - Pesquisar uma data.");
            x = keyboard.nextInt();

        } while (x != 1 && x != 2);

        if( x == 1) {

            for (Holidayzer i: list) {
                System.out.println(i);
            }
            
        } else if (x == 2){
            
            System.out.println("Digite a data que quer pesquisar.");
            String data = keyboard.next();
            for (Holidayzer i: list) {
                if(i.GetData().equals(data)){
                    System.out.println("Dia "+i.GetData()+" é "+i.GetName()+"! 🎉");
                }
            }
            System.out.println("Dia "+data+" não é feriado 🥲");
        }
    }
}
