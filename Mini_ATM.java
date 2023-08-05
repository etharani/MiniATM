import java.util.*;
public class Mini_ATM {
public static void main(String args[]){
    int pin=1234;
    double Balance=10000;
    double AddAmount=0;
    double TakeAmount=0;
    String name;
    String  telephone;
    String nic;
    String receipt;

    Scanner scanner=new Scanner(System.in);
    System.out.println("*** Welcome to ABC bank ATM ***");
    System.out.print("Enter your pin number :");
    int password = scanner.nextInt();
    if(password==pin){
        System.out.print("Enter your name:");
        name=scanner.next();
        System.out.print("Enter your Telephone number:");
        telephone=scanner.next();
        System.out.print("Enter your NIC:");
        nic=scanner.next();
        System.out.print("Need a receipt for these activities?");
        receipt=scanner.next();
        System.out.println("-----------------------------");
        while(true){
            System.out.println("Conditions to meet your needs are as follows,");
            System.out.println("Press 1 - Check your Balance");
            System.out.println("Press 2 - Deposit Amount");
            System.out.println("Press 3 - Withdrawal Amount");
            System.out.println("Press 4 - EXIT");

            int opt= scanner.nextInt();
            switch (opt){
                case 1:
                    System.out.println(("Your current balance: "+Balance));
                    break;
                case 2:
                    System.out.println("How much amount did you want to deposit to your account : ");
                    AddAmount=scanner.nextDouble();
                    System.out.println("Successfully Credited");
                    Balance +=AddAmount;
                    break;
                case 3:
                    System.out.println("How much amount did you want to withdrawal to your account : ");
                    TakeAmount= scanner.nextDouble();
                    if(TakeAmount> Balance){
                        System.out.println("Your balance is insufficient");
                        System.out.println("Try less your available balance");
                    }
                    else {
                        System.out.println("Successfully Withdrawal");
                        Balance -=TakeAmount;
                    }
                    break;
                case 4:
                    System.out.println("---- Thank you for your service ----");
                    break;
                default:
                    System.out.println("Please enter press the number below 4");
                    break;
            }
            if (opt == 4){

                if(receipt.equals("yes")){
                    System.out.println("---------------------------------------------------");
                    System.out.println("----* Welcome to All in one ABC Bank ATM *---");
                    System.out.println("Name : "+name);
                    System.out.println("Telephone number : "+telephone);
                    System.out.println("NIC number : "+nic);
                    System.out.println("Available balance :"+Balance);
                    System.out.println("Amount deposit :"+AddAmount);
                    System.out.println("amount taken :"+TakeAmount);
                    System.out.println("Thank You!");
                    System.out.println("---------------------------------------------------");
                    break;
                }
                else {
                    System.out.println("Welcome back to");
                    break;
                }
            }
        }
    }
    else {
        System.out.println("Wrong pin number");
        System.out.println("Please enter your correct password");
        System.out.println("Your activity is canceled at this time");
    }
}
}
