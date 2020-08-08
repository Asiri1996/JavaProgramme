package serialize;

import java.io.Serializable;

class Employee implements Serializable{
    private String name;
    private String address;
    private transient int NIC;
    private int number;

    public void mailCheck(){
        System.out.println("Mailing a check to "+name+" "+address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNIC() {
        return NIC;
    }

    public void setNIC(int nIC) {
        NIC = nIC;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    
}