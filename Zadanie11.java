import java.util.Scanner;

/**
 * Created by RENT on 2017-07-18.
 */
public class Zadanie11 {

    public static void pesel(String pesel) {
        if (pesel.length() != 11) {
            System.out.println("Niepoprawna dlugosc numeru pesel");
            return;
        }

        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 0};
        int suma = 0;
        for (int i = 0; i < 11; i++) {
            suma = suma + Integer.parseInt(pesel.substring(i, i + 1)) * (wagi[i]);
        }

        int reszta = suma % 10;
        int cyfraKontr = Integer.parseInt(pesel.substring(10, 11));

        if (reszta != cyfraKontr) {
            System.out.println("Niepoprawny numer pesel!");
        }
        else{
            System.out.println("Numer pesel jest poprawny.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer pesel.");
        String pesel = scanner.nextLine();
        pesel(pesel);
    }
}
