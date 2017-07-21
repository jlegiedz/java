import java.util.Scanner;

/**
 * Created by RENT on 2017-07-17.
 */
public class zadanie5 {


    public static void iloczyn(int quantity, int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantity ; i++) {
            System.out.println("Podaj liczbe: ");
            numbers[i] = scanner.nextInt();
        }
//        for (int i = 0; i < quantity; i++) {
//            System.out.println(numbers[i]);
//        }

        int iloczynLiczb = obliczIloczynLiczb(numbers);
        System.out.println("Iloczyn podanych liczb wynosi: "+ iloczynLiczb);

    }

    private static int obliczIloczynLiczb(int[] numbers) {
        int iloczynLiczb = 1;
        for (int i = 0; i < numbers.length ; i++) {
            iloczynLiczb = iloczynLiczb * numbers[i];
        }
        return iloczynLiczb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int quantity = scanner.nextInt();
        int[] numbers = new int[quantity];
        iloczyn(quantity, numbers);
    }
}
