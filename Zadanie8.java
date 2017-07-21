import java.util.Random;

public class Zadanie8 {

    public static void createTabel() {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + ",");
        }


        System.out.println("Zliczone elemnty:");
        int out[] = new int[21];
        // Liczenie
        for (int i = 0; i < array.length; ++i) {
            //out[array[i]] += 1;
             out[array[i]] = out[array[i]]+1;
        }
       // for (int elem : array) {
       //     out[elem] += 1;
       // }

        // Wyświetlanie
        for (int i = 0; i < out.length; ++i) {
            System.out.println(i + ": " + out[i]);
        }
    }


    public static void main(String[] args) {

        createTabel();

    }
}
