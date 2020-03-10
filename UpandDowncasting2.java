class UpandDowncasting{
    public static void main(String[] args)
    {
       A a = new B();
       a.print();
    }
}

class A{

    void print()
    {
        System.out.println("This is class A");
    }
}

class B extends A{

    void print()
    {
        System.out.println("This is class B");
    }
}