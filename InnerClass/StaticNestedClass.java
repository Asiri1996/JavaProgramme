class StaticNestedClass{
    static int a = 40;

    static class InnerClass{
        void display(){
            System.out.println("a = "+a);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.InnerClass obj = new StaticNestedClass.InnerClass();
        obj.display();
    }
}