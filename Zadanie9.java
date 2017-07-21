import java.util.Arrays;
import java.util.Scanner;


public class Zadanie9 {

    public static void sortNumbers(int quantity, int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantity ; i++) {
            System.out.println("Podaj liczbe: ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        //odpowiednio: szukany_procent=0.5 i szukany_procent=0.95)
        double szukanyProc1 = 0.5;
        double szukanyProc2 = 0.95;
        // <indeks_percentylu> = <podłoga>( <maksymalny_indeks_tablicy> * <szukany_procent> )
        // Żeby zmienić wynik Math.floor() z double na int, potrzebnego do indeksowania tablicy, trzeba użyć rzutowania: (int).
        // Ostatecznie: <indeks_percentylu_w_posortowanej_tablicy> = (int)Math.floor(<maksymalny_indeks_tablicy> * <szukany_procent>);
        int indeksPercentylu1 = (int)Math.floor((numbers.length-1)*szukanyProc1);
        int indeksPercentylu2 = (int)Math.floor((numbers.length-1)*szukanyProc2);
        System.out.println("50. percentyl: "+ numbers[indeksPercentylu1]);
        System.out.println("95. percentyl: "+ numbers[indeksPercentylu2]);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int quantity = scanner.nextInt();
        int[] numbers = new int[quantity];
        sortNumbers(quantity,numbers);

    }
}
