import java.util.*;
import java.util.function.Function;
import java.util.function.BiFunction;

public class FunctionalInterfaceEx2 {

    public static void main(String[] arg) {

        // Function takes one argument and produce one result

        System.out.println(incrementByOneFunction.apply(2));

        System.out.println(multipleByTen.apply(12));

        System.out.println(addByOneThenMulByTen.apply(19));

        // BiFunction takes two argument and produce one result

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));
    }

    static Function<Integer,Integer> incrementByOneFunction = number -> number + 1; 

    static Function<Integer,Integer> multipleByTen = number -> number * 10;

    static Function<Integer,Integer> addByOneThenMulByTen = incrementByOneFunction.andThen(multipleByTen);

    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = 
                (numberToIncrementByOne, numberToMultipleBy) -> (numberToIncrementByOne + 1) * numberToMultipleBy;
                
}