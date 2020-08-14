import java.io.IOException;

interface I {
    void m1();
}

class A implements I{
    public void m1() {
        System.out.println("Class A m1 method");
    }
}

class B implements I{
    public void m1(){
        System.out.println("Class B m1 method");
    }
}

class C implements I{
    public void m1(){
        System.out.println("Class C m1 method");
    }
}

public class LooseCoupling {
    public static void main(String[] args) throws IOException{
        I i = new A();
        i.m1();
        i = new B();
        i.m1();
        i = new C();
        i.m1();
    }
}