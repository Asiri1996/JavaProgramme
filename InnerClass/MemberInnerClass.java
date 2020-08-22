class MemberInnerClass{
    private int data=20;

    class Inner{
        void msg(){
            System.out.println("Data = "+data);
        }    
    }

    public static void main(String[] args) {
        MemberInnerClass m = new MemberInnerClass();
        MemberInnerClass.Inner n = m.new Inner();
        n.msg();
    }
}