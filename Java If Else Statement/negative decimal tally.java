import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        float num1 = input.nextFloat(), num2 = input.nextFloat(), num3 = input.nextFloat(), num4 = input.nextFloat();

        if (num1 < 0 && num2 < 0 && num3 < 0 && num4 < 0) {
            float digit1 = num1 + num2 + num3 + num4;
            System.out.format("%.2f" ,digit1);
        } else if (num1 < 0 && num2 > 0 && num3 < 0 && num4 < 0) {
            float digit2 = num1 + num3 + num4;
            System.out.format("%.2f" ,digit2);
        } else if (num1 < 0 && num2 > 0 && num3 > 0 && num4 < 0) {
            float digit3 = num1 + num4;
            System.out.format("%.2f" ,digit3);
        } else if (num1 > 0 && num2 > 0 && num3 < 0 && num4 > 0) {
            float digit4 = num3;
            System.out.format("%.2f" ,digit4);
        } else if (num1 < 0 && num2 > 0 && num3 > 0 && num4 > 0) {
            float digit5 = num1;
            System.out.format("%.2f" ,digit5);
        } else if (num1 > 0 && num2 < 0 && num3 > 0 && num4 > 0) {
            float digit5 = num2;
            System.out.format("%.2f" ,digit5);
        } else if (num1 > 0 && num2 > 0 && num3 > 0 && num4 < 0) {
            float digit6 = num4;
            System.out.format("%.2f" ,digit6);
        } else if (num1 > 0 && num2 < 0 && num3 < 0 && num4 < 0) {
            float digit7 = num2 + num3 + num4;
            System.out.format("%.2f" ,digit7);
        } else if (num1 < 0 && num2 < 0 && num3 < 0 && num4 > 0) {
            float digit8 = num1 + num2 + num3;
            System.out.format("%.2f" ,digit8);
        } else if (num1 < 0 && num2 < 0 && num3 > 0 && num4 < 0) {
            float digit9 = num1 + num2 + num4;
            System.out.format("%.2f" ,digit9);
        } else if (num3 < 0) {
            float digit10 = num3;
            System.out.format("%.2f" ,digit10);
        } else if (num1 < 0 && num2 < 0 && num3 > 0 && num4 > 0) {
            float digit11 = num1 + num2;
            System.out.format("%.2f" ,digit11);
        } else if (num1 < 0 && num2 > 0 && num3 < 0 && num4 > 0) {
            float digit12 = num1 + num3;
            System.out.format("%.2f" ,digit12);
        } else if (num1 < 0 && num2 > 0 && num3 > 0 && num4 < 0) {
            float digit13 = num1 + num4;
            System.out.format("%.2f" ,digit13);
        } else if (num1 > 0 && num2 < 0 && num3 < 0 && num4 > 0) {
            float digit14 = num2 + num3;
            System.out.format("%.2f" ,digit14);
        } else if (num1 > 0 && num2 < 0 && num3 > 0 && num4 < 0) {
            float digit15 = num2 + num4;
            System.out.format("%.2f" ,digit15);
        } else if (num1 > 0 && num2 > 0 && num3 < 0 && num4 < 0) {
            float digit16 = num3 + num4;
            System.out.format("%.2f" ,digit16);
        } else if (num1 > 0 && num2 > 0 && num3 > 0 && num4 > 0) {
            float digit17 = 0;
            System.out.format("%.2f" ,digit17);
        } 
        
    }
}