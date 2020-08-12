public class TightCoupling {
    public static void main(String[] args) {              
        Test t = new Test();
        t.display();
    }
}

class Test{
    Demo demo;
    Test(){
        //Demo is tightly coupled to Test
        demo = new Demo();
    }
    public void display(){
        System.out.println("Test");
        demo.display();
    }
}

class Demo{
    public void display(){
        System.out.println("Demo");
    }
}