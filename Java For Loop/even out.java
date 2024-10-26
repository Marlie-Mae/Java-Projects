import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
         for( int i = 0; a <= b; a++) {
             if((a % 2) ==0) {
                 System.out.print(a + " ");
             }
         }
    }
}