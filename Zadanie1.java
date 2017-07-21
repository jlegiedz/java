/**
 * Created by RENT on 2017-07-17.
 */
public class Zadanie1 {

    public static void print(int line) {
        int i = 1;
        int j = 1;
        while (line > i) {
            System.out.print("* ");
            i++;
        }
        System.out.println();
        System.out.println("Java jest super!");
        System.out.println();
        while (line > j) {
            System.out.print("* ");
            j++;
        }
    }

    public static void main(String[] args) {
        print(10);
    }
}
