/**
 * Genaric Methods
 */

public class Genarics2 {
    
    private static <E> void printArray(E[] elements) {
        for (E e : elements) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {12,23,34,56,77,89,90};
        Character[] charArray = {'S','L','I','I','T'};

        printArray(intArray);
        printArray(charArray);
    }
}


