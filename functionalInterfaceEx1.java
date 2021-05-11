import java.util.*;

public class functionalInterfaceEx1 {
    
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John",Gender.MALE));
        people.add(new Person("Maria",Gender.FEMAIL));
        people.add(new Person("Aisha",Gender.FEMAIL));
        people.add(new Person("Alex",Gender.MALE));
        people.add(new Person("Alice",Gender.FEMAIL));

        // Imperative Approch
        System.out.println("Imperative Approch");
        List<Person> femails = new ArrayList<>();

        for(Person p: people) {
            if(Gender.FEMAIL.equals(p.gender)) {
                femails.add(p);
                System.out.println(p);
            }
        }

        // Declarative Approch
        System.out.println("Declarative Approch");
        people.stream()
                .filter(person -> Gender.FEMAIL.equals(person.gender))
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person (String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

       // @override
        public String toString() {
            return "Person { " +
                   "name = " + name + '\'' +
                   ", gender = " + gender + 
                   "}"; 
        }
    }

    public enum Gender {
        MALE, FEMAIL
    }
}