/**
 * NestedInterfaceInsideInterface
 */
interface NestedInterfaceInsideInterface1 {

    interface InnerNestedInterfaceInsideInterface1{
        void msg();
    }
    
}

/**
 * NestedInterfaceInsideInterface
 */
class NestedInterfaceInsideInterface implements NestedInterfaceInsideInterface1.InnerNestedInterfaceInsideInterface1{

    public void msg(){
        System.out.println("Massage");
    }

    public static void main(String[] args) {
        NestedInterfaceInsideInterface1.InnerNestedInterfaceInsideInterface1 n = new NestedInterfaceInsideInterface();
        n.msg();
    }
}