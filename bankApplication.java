import java.util.Scanner;

public class bankApplication {

public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     bankAccount bankA = new bankAccount("Killian Power", "3920483");
     bankA.displayMenu();

}

}

class bankAccount{
    int balance;
    int preTransaction;
    String customerName;
    String IdCustomer;

    bankAccount(String cname, String idC){
      customerName = cname;
      IdCustomer = idC;
    }

    void deposit(int amount){ // no return value hence void method
       if(amount != 0){
           balance = balance + amount;
           preTransaction = amount;
       }
    }

    void withdraw(int amount){
      if (amount != 0){
        balance = balance - amount;
        preTransaction = -amount;

      }
    }

     void getPreviousTrans(){
      if (preTransaction >0){
        System.out.println("Deposited: " + preTransaction);
      }
      else if (preTransaction <0) {
        System.out.println("Withdrawn : "+ Math.abs(preTransaction));
      }
      else{
        System.out.println("No transaction was made");
      }
     }
     void displayMenu(){
      int option ='0';
      Scanner sc = new Scanner(System.in);

      System.out.println("Welcome "+customerName);
      System.out.println("Your ID is: "+ IdCustomer);
      System.out.println();
      System.out.println();
      System.out.println("1.) Check Balance");
      System.out.println("2.) Deposit");
      System.out.println("3.) Withdraw");
      System.out.println("4.) Previous Transaction");
      System.out.println("5.) Exit");

      do{
        System.out.println("===========================");
        System.out.println("Enter option");
        System.out.println("===========================");
        option = sc.nextInt();
        
        switch (option) {
          case 1:
          System.out.println("===========================");
          System.out.println("Balance is: €"+balance);
          System.out.println("===========================");
          System.out.println();
            break;
        
          case 2:
          System.out.println("===========================");
          System.out.println("Enter amount to be deposited: €");
          System.out.println("===========================");
          int amount = sc.nextInt();
          deposit(amount);
          System.out.println();
           break;

           case 3 :
           System.out.println("===========================");
           System.out.println("Enter amount to be withdrawn: €");
           System.out.println("===========================");
           int amount2 = sc.nextInt();
           withdraw(amount2);
           System.out.println();
           break;

           case 4 :
           System.out.println("===========================");
           getPreviousTrans();
           System.out.println("===========================");
           System.out.println();
           break;

           case 5 :
           System.out.println("===========================");
           break;

           default:
           System.out.println("Invalid Option, Please try again");
           break;
        }
      }while (option != 5);
     }
  }
