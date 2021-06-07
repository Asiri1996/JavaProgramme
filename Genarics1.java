
/**
 * Genaric Class
 */ 
class MyGen<T> {
    T obj;

    void add(T val){
        obj = val;
    }

    T get(){
        return obj;
    }
}

public class Genarics1 {
    
    public static void main(String[] args) {
        MyGen<Integer> myGen1 = new MyGen<>();
        myGen1.add(15);
        System.out.println(myGen1.get());

        MyGen<String> myGen2 = new MyGen<>();
        myGen2.add("Asiri");
        System.out.println(myGen2.get());
    }
}
