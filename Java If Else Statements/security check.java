import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();

        if(age >= 18) {
            System.out.println("Adult");   
        }else{
            System.out.println("Minor");
        }
    }
}