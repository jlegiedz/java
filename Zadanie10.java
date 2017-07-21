import java.util.Random;

/**
 * Created by RENT on 2017-07-18.
 */
public class Zadanie10 {

    public static void naturalna(){

        Random random = new Random();
        int max = Integer.MAX_VALUE;
        int liczbaNaturalna = random.nextInt(max);
        System.out.println(liczbaNaturalna);


        int suma = 0;
        while(liczbaNaturalna > 0){
            suma = suma + liczbaNaturalna%10;
            liczbaNaturalna = liczbaNaturalna/10;
        }
        System.out.println(suma);
    }

    public static void main(String[] args) {
    naturalna();
    }
}
