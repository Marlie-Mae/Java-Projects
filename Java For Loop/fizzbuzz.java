import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int numOne = scan.nextInt();

        for(int i = 1; i <= numOne; i++){

            if (i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}
            else if (i % 3 == 0){
				System.out.println("Fizz");
			}
            else if (i % 5 == 0){
				System.out.println("Buzz");
            }
    }
 }
}