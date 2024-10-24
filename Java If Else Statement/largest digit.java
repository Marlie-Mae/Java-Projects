import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int a = num1 / 100;
        int b = (num1 / 10) % 10;
        int c = num1 % 10;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
       
    }
}