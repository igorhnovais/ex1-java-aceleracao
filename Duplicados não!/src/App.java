public class App {
    public static void main(String[] args) throws Exception {
        //array1 => "Morango", "Banana", "Maçã", "Uva", "Caqui"
        //array2 => "Manga", "Caqui", "Morango", "Amora"
        //array3 => "Carro", "Moto", "Navio", "Avião"
        //array4 => "Barco", "Avião", "Trem", "Motocicleta", "Trem"
        String[] array1 = {"Carro", "Moto", "Navio", "Avião"};
        String[] array2 = {"Barco", "Avião", "Trem", "Motocicleta", "Trem"};

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
