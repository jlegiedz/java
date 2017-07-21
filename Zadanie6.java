import java.util.Scanner;


public class Zadanie6 {

    public static void srednia(int quantity, int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantity ; i++) {
            System.out.println("Podaj liczbe: ");
            numbers[i] = scanner.nextInt();
        }
//        for (int i = 0; i < quantity; i++) {
//            System.out.println(numbers[i]);
//        }

        double sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum = sum + numbers[i];
        }
        double average = sum/numbers.length;
        System.out.println("Srednia arytmetyczna podanych liczb wynosi: "+ average);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc liczb: ");
        int quantity = scanner.nextInt();
        int[] numbers = new int[quantity];
        srednia(quantity, numbers);
    }
}
