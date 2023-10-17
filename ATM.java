import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int balance = 5000, withdraw, deposit;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("**Automated Teller Machine**");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. EXIT");
                System.out.println("Choose the operation you want to perform:");

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter money to be withdraw:");

                        withdraw = sc.nextInt();

                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                        } else {
                            System.out.println("Insufficient balance");
                        }

                        System.out.println("");
                        break;
                    case 2:

                        System.out.print("Enter money to be deposited:");

                        deposit = sc.nextInt();

                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println("");
                        break;

                    case 3:

                        System.out.println("Balance : " + balance);
                        System.out.println("");
                        break;

                    case 4:

                        System.exit(0);
                    default:
                        System.out.println("Invalid Choice");
                }

            }
        }
    }
}
