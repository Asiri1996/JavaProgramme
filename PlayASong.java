import java.util.Scanner;

class User{
    private int id;
    private int personId;
    String name;      
    String email;     //Name and email variables access from child classes    
    
    public void setID(int id){
      this.id=id;
    }
    public int getID(){
      return id;
    }
    public void setPersonID(int personId){
      this.personId=personId;
    }
    public int getPersonID(){
      return personId;
    }
    public void getDetails(){
      printDetails();
    }

    private void printDetails()
    {
      System.out.println(name);
      System.out.println(email);
    }
}
class Artist extends User{
  private String music_genre; 
  private int number_of_song;
  private String[] songList = new String[5];
  
  Artist(String name,String email){
    this.name=name;
    this.email=email;
  }

  public void setMusicGenre(String music_genre){
    this.music_genre=music_genre;
  }
  public String getMusicGenre(){
    return music_genre;
  }
  public void setNumberOfsong(int number_of_song){
    this.number_of_song=number_of_song;
  }
  public int getNumberOfsong(){
    return number_of_song;
  }
  public void setSongList(String[] songList){
    this.songList=songList;
  }
  public String[] getSongList(){
    return songList;
  }
  @Override
  public void getDetails() {
    printDetails();
  }

  private void printDetails()
  {
    super.getDetails();
    System.out.println(music_genre);
      System.out.println(number_of_song);
      for(int i=0;i<number_of_song;i++){
        System.out.println(songList[i]);
      }
  }
}

interface Calculations{
  public void calculateRevenue();
}

class Operator extends User implements Calculations
{
  private int employee_number;
  private String jobTitle;

  Operator(String name,String email){
    this.name=name;
    this.email=email;
  }

  public void setEmployeeNumber(int employee_number){
    this.employee_number=employee_number;
  }
  public int getEmployeeNumber(){
    return employee_number;
  }
  public void setJobTitle(String jobTitle){
    this.jobTitle=jobTitle;
  }
  public String getJobTitle(){
    return jobTitle;
  }
  public void getDetails(){
    printDetails();
  }
  /*public void getCalculateRevenue(){
    calculateRevenue();
  }*/
  public void calculateRevenue(){
    System.out.print("Enter number of downloads:   ");
    Scanner myObj8 = new Scanner (System.in);
    int downloads = myObj8.nextInt();
    int downloadsPrice = 2500 * downloads;
    System.out.println("Album revenue is LKR:  "+downloadsPrice);
  }
  private void printDetails(){
    super.getDetails();
    System.out.println(employee_number);
    System.out.println(jobTitle);
  }
}
 
public class PlayASong
{
  public int z=0;
  public static void main (String[] args)
  {
    User[] obj1 = new User[10];       //To store Artist objects
    User[] obj2 = new User[10];       //To store Operator objects
    User a = new User();  
    User b;
    int y=0;
    int u=0;
    int v=0;
    do{
        System.out.println("*******************************************************************************");
        System.out.println ("1.Register    2.get Details   3.Exit");
        System.out.print ("Enter your option here:  ");
        final Scanner myObj = new Scanner (System.in);
        final int p = myObj.nextInt ();

        PlayASong q = new PlayASong();

        if(p==1){
          b=q.register(a);
          //System.out.print(b.id);
          if(b.getID()==1){
            obj1[v]= new User();
            obj1[v]=b;
            //obj1[v].printDetails();
            v++;
          }
          else if(b.getID()==2){
            obj2[u]= new User();
            obj2[u]=b;
            u++;
          }
        }
        else if(p==2){
          System.out.println("1.Artist    2.Operator");
          System.out.print("Whose details do you want? ");
          final Scanner myObj6 = new Scanner(System.in);
          final int n = myObj6.nextInt();
          if(n==1)
            q.get_Details(obj1);
          else if(n==2)
            q.get_Details(obj2);
        }
        else if(p==3)
            y=1;
        else
            System.out.println ("Your entered was invalid!!");
    } 
    while(y!=1);
  }

  public User register(User obj) {
    User ar = obj;
    PlayASong m = new PlayASong();
    System.out.println ("1.Artist    2.Operator");
    System.out.print("Enter your relevant  User Categorie: ");
    final Scanner myObj1 = new Scanner (System.in);
    final int n = myObj1.nextInt ();

    if (n == 1)
      {
        ar = m.artist();
        return ar;
      }
    else if (n == 2)
      {
        ar=m.operator();
        return ar;
      }
    else
      {
	      System.out.println ("Your entered was invalid!!");
      }
    final User x = new User();      
    return x;       //virtual return
  }
  public Artist[] ObjArray(Artist[] obj){
    return obj;
  }

  public void get_Details(User[] obj)
  {
    int j=0;
    
    User[] obj3 = new User[10];
    
    for(int i=0;i<10;i++){
      obj3[i]= new User();
      obj3[i]=obj[i];
    }
    /*while(obj3[z]!=null){         //to get All Details of object Array
      System.out.print(obj3[z].personId);
      //obj3[z].printDetails();
      z++;
    }*/
    System.out.println ("Artists' ID numbers begin from 100 and Operators' ID numbers begin from 200");
    System.out.print ("Enter ID Number here:  "); 
    final Scanner myObj7 = new Scanner (System.in);
    final int id = myObj7.nextInt ();

    while(obj3[j]!=null){
      if(obj3[j].getPersonID()==id){ 
        obj3[j].getDetails();
        break;
      }
      else{
        System.out.println("ID number "+id+" was not there");
      }
      j++;
    }
  }

  static int artistId=100;  //artistId Auto incrementt
  public Artist artist()
  {
    final Scanner myObj2 = new Scanner (System.in);	// Create a Scanner object
    System.out.print("Enter Artist's name:    ");
    final String userName = myObj2.nextLine ();	// Read user input
    
    System.out.print("Enter Email:   ");
    final Scanner myObj3 = new Scanner (System.in);
    final String email = myObj3.nextLine();
    
    final Artist a = new Artist (userName,email);
    a.setID(1);
    a.setPersonID(artistId);
    artistId=artistId+1;

    System.out.print("Enter Music Genre:   ");
    final Scanner myObj4 = new Scanner (System.in);
    final String music_genre = myObj4.nextLine();
    a.setMusicGenre(music_genre);

    System.out.print("Enter Number Of Songs:   ");
    final Scanner myObj5 = new Scanner (System.in);
    final int number_of_song = myObj5.nextInt();
    a.setNumberOfsong(number_of_song);

    final String[] strArray = new String[5];
    final Scanner s = new Scanner(System.in);
    System.out.println("Enter Songs List here:   ");
    for(int i=0;i<number_of_song;i++){
        strArray[i] = s.nextLine();
        //a.songList[i]=strArray[i];
    }
    a.setSongList(strArray);
    //set_Details(a);
    return a;
  }

  static int operatorId=200;  //operatorId Auto increment
  public Operator operator()
  {
    final Scanner myObj9 = new Scanner (System.in);	// Create a Scanner object
    System.out.print("Enter Operator's name:    ");
    final String userName = myObj9.nextLine ();

    System.out.print("Enter Email:   ");
    final Scanner myObj10 = new Scanner (System.in);
    final String email = myObj10.nextLine();

    Operator op = new Operator(userName,email);
    op.setID(2);
    op.setPersonID(operatorId);
    op.setEmployeeNumber(operatorId);
    operatorId+=1;
    
    System.out.print("Enter Job Title:   ");
    final Scanner myObj11 = new Scanner (System.in);
    final String jobTitle = myObj11.nextLine();
    op.setJobTitle(jobTitle);

    op.calculateRevenue();
    return op;
  }
}
