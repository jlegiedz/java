package sda.code.intermediate;

import io.vavr.Tuple;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Functional2 {


    public static void main(String[] args) {
        ex2(-3.0);
        ex3(20);
        ex3(21);
        ex4();
        ex5(new int[] {5, 1, 6, -1, 3, -4, 9});
        ex6(new int[] {5, 1, 6, -1, 3, -4, 9, 0, 3});
        ex7(10);
        ex7(100);
//        ex10(new Random().nextInt(Integer.MAX_VALUE));
//        ex11();
//        ex8();
    }

    private static class Pair {
        public final int index;
        public final int sum;
        public Pair(int index, int sum) {
            this.index = index;
            this.sum = sum;
        }
    }

    private static void ex7(int max) {
        io.vavr.collection.Stream
//                .iterate(new Pair(0, 0), pair ->
//                        new Pair(pair.index + 1, pair.sum + pair.index + 1))
                .iterate(Tuple.of(0, 0), pair ->
                        Tuple.of(pair._1 + 1, pair._2 + pair._1 + 1))
//                .takeWhile(pair -> pair.sum <= max)
                .takeWhile(pair -> pair._2 <= max)
//                .forEach(pair -> System.out.println("Sum: " + pair.sum + " steps: " + pair.index));
                .forEach(pair -> System.out.println("Sum: " + pair._2 + " steps: " + pair._1));
    }

    private static void ex6(int[] ints) {
        OptionalDouble avg = IntStream.of(ints).average();
        avg.ifPresent(System.out::println);
    }

    private static void ex5(int[] ints) {
        int product = IntStream.of(ints).reduce(1, (a, b) -> a * b);
        System.out.println(product);
    }

    private static void ex4() {
        Stream.iterate(1, x -> x + 1).limit(20)
                .forEach(i -> {
                    if (i % 3 == 0) {
                        System.out.print("Fizz");
                    }
                    if (i % 5 == 0) {
                        System.out.print("Buzz");
                    }
                    if (i % 3 != 0 && i % 5 != 0) {
                        System.out.print(i);
                    }
                    System.out.println();
                });
    }

    private static void ex3(int max) {
        io.vavr.collection.Stream
                .iterate(1, x -> x + 2)
                .takeWhile(x -> x <= max)
                .forEach(System.out::println);
    }

    private static void ex2(double n) {
        Optional<Double> cube = Stream.of(n).map(x -> x * x * x).findFirst();
        cube.ifPresent(System.out::println);
    }

    private static void ex10(int number) {
       int suma = Stream.of(number)
               .map(n -> n.toString())
               .flatMap(s -> Stream.of(s.split("")))
               //map(ch ->Integer.valueOf(ch))
               //reduce(0, (a,b) -> a+b)
               .mapToInt(Integer::parseInt) // n -> Integer.parseInt(n);
               .sum();
        System.out.println("Number :" + number + "sum:" + suma);
    }

    private static void ex11(String pesel){
        List<Integer> weights = io.vavr.collection.Stream.of(1,3,7,9,1,3,7,9,1,3);
        Integer vectorProduct =
                io.vavr.collection.Stream.of(pesel.split(""))
                .take(10)
                .map(s-> Integer.valueOf(s))
                .zipWith(weights, (a,b) -> a*b)
                .reduce((a,b) -> a+b);
        int subtractor = vectorProduct % 10;
        int checksum;
        if(subtractor != 0){
            checksum = 10-subtractor;
        }
        else{
            checksum = subtractor;
        }

        if(Integer.toString(checksum).charAt(0) == pesel.charAt(10)) {
            System.out.println("Cacy");
        }
        else {
            System.out.println("Be");
        }
        }

//        System.out.println("Pesel jest"+
//                (Integer.toString(checksum).charAt(0) == pesel.charAt(10)?
//                "Cacy" : "Be"));

        // optional

    List<Integer> pusta = new ArrayList<>();
    List<Integer> jeden = new Arrays.asList(1);
    List<Integer> kilka = new Arrays.asList(1,2,3,4,5);

    Optional<Integer> pusty =Optional.empty();
    Optional<Integer> pelny= Optional.of(1);
    Optional<Integer> tezPusty =Optional.ofNullable(null); //optional nigdy nie bedzi emial nulla, jak bedzie null to stworzy empty
    Optional<Integer> tezPelny =Optional.ofNullable(1);


    // sprawdzi czy empty jak tak t stowrzy pusty,


    private static void ex8(){
        Stream.generate(Math::random)                           // z klasy Math random, generate nie ma konca wiec generuje losowe w nieskonczoosc
                .map(rand -> (int)Math.floor(rand * 21)
                .limit(100)                                    // ograniczam do 100 lizb generator
                .collect(Collectors.toMap(
                        x -> x,                              // klucze -wartosci z listy
                        x -> 1,                             // value - liczba wystapien
                        (a, b) -> a+b
                ))
                .forEach((key, value) -> System.out.println("Key: " + key + "Value: "+ value)));
    }


}