import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        
        int cube1 = num1*num1*num1;
        int cube2 = num2*num2*num2;
        int cube3 = num3*num3*num3;

        int sum = cube1 + cube2 + cube3;

        if (sum > 0) {
            System.out.println("Positive");
        }else{
            System.out.print("Negative");
        }
        
        
    }
}