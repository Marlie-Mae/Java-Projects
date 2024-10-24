import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        float num1 = input.nextFloat();
        String sign = input.next();
        float num2 = input.nextFloat();
    

        if (sign.equals("+")) {
            float result = num1 + num2;
            System.out.format("%.2f" ,result);
        } else if (sign.equals("-")) {
            float result = num1 - num2;
            System.out.format("%.2f" ,result);
        } else if (sign.equals("*")) {
            float result = num1 * num2;
            System.out.format("%.2f" ,result);
        } else if (sign.equals("/")) {
            float result = num1 / num2;
            System.out.format("%.2f" ,result);
        }

    }
}