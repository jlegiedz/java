import java.util.Scanner;

public class Zadanie3 {
    public static void liczbyNaturalne(int number){
        if(number < 0){
            System.out.println("Blad, podaj liczbe naturalna!");
        }
        if(number >= 0){
            for (int i = 0; i <= number ; i++) {
                if(i % 2 !=0){
                    System.out.print(i + ", ");
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe naturalna:");
        int natNum = scanner.nextInt();
        liczbyNaturalne(natNum);


    }
}
