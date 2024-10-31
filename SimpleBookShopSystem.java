import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char userInput;
        int a, b, c, d, e, f, g, h, i, k;
        int userMoney, totalAmount, book;
        
        a = 250;
        b = 270;
        c = 550;
        d = 600;
        e = 350;
        f = 550;
        g = 450;
        h = 700;
        i = 300;
        k = 500;
        
        System.out.println("                  ---WELCOME TO MAE'S BOOKSHOP---");
        System.out.println();
        
        System.out.print("                     Enter customer's name: ");
        String name = input.next();
        System.out.println();
        System.out.println("===================================================================");
        
        System.out.println("                             ---BOOKS---     ");
        System.out.println("    1.Poemsia by Lang Leav.....Php" + a);
            System.out.println("    2.Pride and Prejudice by Jane Austen.....Php" + b);
        System.out.println("    3.Kiss Her For Me by Alison Cochrun.....Php" + c);
        System.out.println("    4.Astrid Parker Doesn't Fail by Ashley Herring Blake.....Php" + d);
        System.out.println("    5.A Cosmic Kind of Love by Samantha Young.....Php" + e);
        System.out.println("    6.Call Me by Your Name by Andre Aciman.....Php" + f);
        System.out.println("    7.To Kill a Mockingbird by Harper Lee.....Php" + g);
        System.out.println("    8.A Bend in the Road by Nicholas Sparks.....Php" + h);
        System.out.println("    9.Authentically, Izzy by Pepper Bashman.....Php" + i);
        System.out.println("    10.Battle Royal by Lucy Parker.....Php" + k);
        System.out.println("===================================================================");
        
        
        do {
        System.out.println();
        System.out.print("What book would you like to purchase?: ");
        int order = input.nextInt();
        switch(order) {
            
                
                case 1:
                System.out.println("Poemsia by Lang Leav.....Php" + a);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = a * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 2:
                System.out.println("Pride and Prejudice by Jane Austen.....Php" + b);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = b * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 3:
                System.out.println("Kiss Her For Me by Alison Cochrun.....Php" + c);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = c * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 4:
                System.out.println("Astrid Parker Doesn't Fail by Ashley Herring Blake.....Php" + d);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = d * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 5:
                System.out.println("A Cosmic Kind of Love by Samantha Young.....Php" + e);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = e * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 6:
                System.out.println("Call Me by Your Name by Andre Aciman.....Php" + f);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = f * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 7:
                System.out.println("To Kill a Mockingbird by Harper Lee.....Php" + g);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = g * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 8:
                System.out.println("A Bend in the Road by Nicholas Sparks.....Php" + h);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = h * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 9:
                System.out.println("Authentically, Izzy by Pepper Bashman.....Php" + i);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = i * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

                case 10:
                System.out.println("Battle Royal by Lucy Parker.....Php" + k);
                System.out.println();
                System.out.print("How many of that book would you like to purchase?: ");
                book = input.nextInt();
                System.out.println();
                totalAmount = k * book;
                System.out.println("Total amount: Php" + totalAmount);
                System.out.print("Enter payment amount: Php");
                userMoney = input.nextInt();
                if(userMoney >= totalAmount) {
                System.out.println();
            
                System.out.println("---Receipt---");
                System.out.println("Total payment: Php" + totalAmount);
                int change = userMoney - totalAmount;
                if(change >= 0)
                System.out.println("Your change is: Php" + change);
                else
                System.out.println("Insufficient money!");
                } else {
                System.out.println("Insufficient balance!");
                }
                break;

            default:
                
                System.out.println("System error!");
                }
                System.out.println();
                System.out.println("You want to purchase again? (YES/NO)");
                userInput = input.next().charAt(0);
                } while(userInput != 'N' );
                System.out.println();
                System.out.println("--Thank you for purchasing!--");
                System.out.println("--We hope to see you again!--");
        
    }
}
