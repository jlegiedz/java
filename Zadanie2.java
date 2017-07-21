import java.util.Scanner;

/**
 * Created by RENT on 2017-07-17.
 */
public class Zadanie2 {

    public static void cube(double number ){
        double wynik = number*number*number;
        System.out.println(wynik);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe rzeczywista: ");
        double num = scanner.nextDouble();
        cube(num);
    }
}
