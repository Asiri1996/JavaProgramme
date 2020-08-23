/**
 * StaticNestedClassStaticMethod
 */
public class StaticNestedClassStaticMethod {

    static class InnerStaticNestedClassStaticMethod {
        
        static void msg(){
            System.out.println("Inside Inner Class Static Method");
        }

    }

    public static void main(String[] args) {
        StaticNestedClassStaticMethod.InnerStaticNestedClassStaticMethod.msg();
    }
}