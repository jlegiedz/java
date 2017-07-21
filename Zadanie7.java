import java.util.Scanner;

public class Zadanie7 {

    public static void limitedSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Limit: ");
        int limit = scanner.nextInt();
        if(limit < 0){
            System.out.println("Limit musi byc liczba dodatnia!");
        }

        int sum =0;
        int num = 0;
       do{
           sum = sum + num;
           num++;
       }
       while (sum < limit);

      //  while (!(sum >= limit));
        System.out.println(sum);
    }
    public static void main(String[] args) {
        limitedSum();
    }

}
