interface Printable{
    public void print();
}

class Test1 implements Printable{
    public void print(){
        System.out.println("Test1 Method");
    }
}

class Test2 implements Printable{
    public void print(){
        System.out.println("Test2 Method");
    }
}

class Call{
    void invork(Printable p){
        if(p instanceof Test1){
            Test1 t1 = (Test1)p;
            t1.print();
        }
        else{
            Test2 t2 = (Test2)p;
            t2.print();
        }
    }
}

public class Instanceof
{
	public static void main(String[] args) {
		Printable p = new Test1();
		Call c = new Call();
		c.invork(p);
	}
}
