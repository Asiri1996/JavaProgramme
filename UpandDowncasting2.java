class UpandDowncasting{
    public static void main(String[] args)
    {
       A a = new A();
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

    void pri()
    {
        System.out.println("This is class A");
    }
}