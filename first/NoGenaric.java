
package first;

public class NoGenaric {
    public static void printArray(Integer[] InputArray) {
        for (Integer element : InputArray) {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void printArray(Double[] InputArray) {
        for (Double element : InputArray) {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void printArray(Character[] InputArray) {
        for (Character element : InputArray) {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'G', 'E', 'N', 'A', 'R', 'I', 'C' };

        System.out.println("Array IntegerArray Contains: ");
        printArray(intArray);

        System.out.println("Array DoubleArray Contains: ");
        printArray(doubleArray);

        System.out.println("Array CharactoeArray Contains: ");
        printArray(charArray);
    }
}