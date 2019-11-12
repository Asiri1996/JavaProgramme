class Teacher{
    String designation = "Teacher";
    String collageName = "Beginnersbook";
    void does(){
        System.out.println("Teaching");
    }
}

public class PhysicsTeacher extends Teacher{
    String mainSubject = "Physics";
    public static void main(String args[]){
        PhysicsTeacher obj = new PhysicsTeacher();
        System.out.println(obj.collageName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}