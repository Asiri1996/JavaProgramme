public class HelloWorld{

     public static void main(String []args){
        Test t1 = new Test(1,"Asiri",24);
        Test t2 = new Test(2,"Asiri",21);
        Test t3 = new Test(3,"Asiri",18);
        Test t4 = new Test(4,"Asiri",15);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
     }
}

class Test{
    
    int id;
    String name;
    int age;
    
    Test(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    
    public String toString(){
        return id+" "+name+" "+age;
    }
}