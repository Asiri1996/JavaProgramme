import java.util.*;
/**
 * Question
 */
public class Question {

    public static void main(String[] args) {

        int n = 0;
        Scanner sc= new Scanner(System.in);
        Answer answer = new Answer(sc); 
        
        do{
            System.out.println("**********************************Welcome***********************************");
            System.out.println("1.Deposit    2.WithDrow     3.Check Balance     4.Exit");
            System.out.println();
            System.out.print("Please enter the value : ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    answer.deposit();
                    break;
                case 2:
                    answer.withDraw();
                    break;
                case 3:
                    answer.checkBalance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Your entered is Invalid!!");
            }
        }while(n != 4);
    }
}

/**
 * Answer
 */
class Answer {

    public static int accountBalance = 0;
    Scanner sc; 
    int amount = 0;

    Answer(Scanner sc){
        this.sc = sc; 
    }

    void deposit(){
        int amount = 0;
        System.out.print("Enter Amount to deposit : ");
        amount = sc.nextInt();
        accountBalance = accountBalance + amount;
    }

    void withDraw(){
        int amount = 0;
        System.out.print("Enter Amount to withdrow : ");
        amount = sc.nextInt();

        if (accountBalance > amount) {
            accountBalance = accountBalance - amount;
        } else {
            System.out.println("Your account Balance is not Sufficiant!!");
        }
        
    }

    void checkBalance(){
        System.out.println("Your balance : " + accountBalance);
    }
    
}