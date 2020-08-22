class LocalInnerClass{
    void display(){
        class Local{
            void msg(){
                System.out.println("Inside Local Class");
            }
        }
        Local l = new Local();
        l.msg();
    }

    public static void main(String[] args) {
        LocalInnerClass lClass = new LocalInnerClass();
        lClass.display();
    }
}