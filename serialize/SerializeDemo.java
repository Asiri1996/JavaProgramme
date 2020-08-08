package serialize;

import java.io.*;
//import ".Employee.java";
class SerializeDemo{

    public static void main(final String[] args) {
       final Employee emp = new Employee();
       emp.setName("Asiri");
       emp.setAddress("Ananda vidyala mavatha, Elpitiya");
       emp.setNIC(960283481);
       emp.setNumber(101);
       
       try {
           final FileOutputStream fileout = new FileOutputStream("employee.ser");
           final ObjectOutputStream Objout = new ObjectOutputStream(fileout);
           Objout.writeObject(emp);
           Objout.close();
           fileout.close();
           System.out.println("Serialized data is saved in employee.ser");
       } catch (final IOException i) {
           i.printStackTrace();
       }
    }
    
}