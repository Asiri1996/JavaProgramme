class Animal{
    public void displayInfo(){
        System.out.println("I am an Animal.");
    }
}
class Dog extends Animal{
    //@override
    public void displayInfo() {
        System.out.println("I am a Dog.");
    }
}
class methodoverride1{
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}