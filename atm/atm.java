import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int pin=0000;
        String name;

        int Balance=100000;
        int withdraw;
        int AddAmount;
        int Takenamount;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin : ");

        int Password = sc.nextInt();

        if(Password==pin){
            System.out.println("Enter your name : ");
            name=sc.next();
            System.out.println("Welcome"+ name);

            while(true){
                System.out.println("Press 1 to continue");
                System.out.println("Press 2 to Exit!");
                System.out.println("press 3 to Withdraw");
                System.out.println("press 4 to AddAmount");
                System.out.println("press 5 for Balance");
                System.out.println("press 6 for recipt");

                int num=sc.nextInt();
                switch(num){
                    case 1:
                        System.out.println("Yes! you may proceed for further process...");
                        break;
                    case 2:
                        System.out.println("Exit the Process");
                        break;
                    case 3:
                        System.out.println("How much of amount you want to withdraw ");
                        withdraw=sc.nextInt();
                        if(withdraw>Balance){
                            System.out.println("Insufficient Balance");
                        }else {
                            System.out.println("Successfully withdraw");
                            Balance=Balance-withdraw;
                            System.out.println("Your Balance amount is :"+Balance);
                        }
                        break;
                    case 4:
                        System.out.println("How much of amount you want to Add in your bank account");
                        AddAmount=sc.nextInt();
                        System.out.println("successfully credited");
                        Balance=Balance+AddAmount;
                        System.out.println("Your current balance is :"+Balance);
                        break;
                    case 5:
                        System.out.println("Balance Amount :"+Balance);
                        break;
                    case 6:
                        System.out.println("THANK YOU!");
                        System.out.println("Available Balance is :"+Balance);
                        break;
                }
                if(num==7){
                    System.out.println("Thank for choosing us!");
                    System.out.println(" SBI ");
                    break;
                }
            }
        }
        else{
            System.out.println("Wrong Pin");
        }
    }
}
