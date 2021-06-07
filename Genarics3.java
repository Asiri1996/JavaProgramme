/**
 * Multiple Parameter Using Generics
 */

class TwoGen<T,V> {
    T obj1;
    V obj2;

    TwoGen(T t,V v) {
        obj1 = t;
        obj2 = v;
    }

    void showType() {
        System.out.println("Type of T is : " + obj1.getClass().getSimpleName());
        System.out.println("Type of V is : " + obj2.getClass().getSimpleName());
    }
} 

public class Genarics3 {
    
    public static void main(String[] args) {
        TwoGen<String,Integer> tgOb = new TwoGen<>("Asiri Senith Manjitha",17326);
        tgOb.showType();
    }
}
