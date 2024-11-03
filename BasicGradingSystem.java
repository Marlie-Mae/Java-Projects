import java.util.Scanner;

public class gradingsystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int i = 0;
        double[] grade = new double[30];
        String[] account = new String[30];
        String[] remark = new String[30];

        int option;
        do {
            double sum = 0.0;
            System.out.print("GRADING SYSTEM\n[1]Add Student info\n[2]Display Student List\n[3]Exit\n- ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    if (i > 30) {
                        System.out.println("Student list is full!");
                    } else {
                        System.out.print("\nInput Student Complete Name: ");
                        account[i] = sc.nextLine();
                        System.out.println("\nInput the marks of the student on the following major programs");
                        System.out.print("Art Appreciation: ");
                        sum += sc.nextDouble();
                        System.out.print("NSTP 2: ");
                        sum += sc.nextDouble();
                        System.out.print("Computer Programming 2: ");
                        sum += sc.nextDouble();
                        System.out.print("Discrete Mathematics: ");
                        sum += sc.nextDouble();
                        System.out.print("Physical Education 2: ");
                        sum += sc.nextDouble();
                        System.out.print("Readings in Philippine History: ");
                        sum += sc.nextDouble();
                        System.out.print("Human and Computer Interaction: ");
                        sum += sc.nextDouble();
                        System.out.print("Operating System: ");
                        sum += sc.nextDouble();
                        System.out.print("Intro to Web Design : ");
                        sum += sc.nextDouble();
                        System.out.println();
                        double average = sum / 9.0;
                        String mark = average <= 3.0 ? "PASSED" : "FAILED";
                        grade[i] = average;
                        remark[i] = mark;
                        ++i;
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.printf("  %-27s  %-12s %-10s\n", "STUDENT NAME", "GRADE", "REMARK");
                    int j = 0;

                    for(; j < account.length; ++j) {
                        if (account[j] != null && !account[j].isEmpty()) {
                            System.out.printf("[%d] %-25s  %-12.2f %-10s\n", j, account[j].toUpperCase(), grade[j], remark[j]);
                        }
                    }

                    System.out.println();
                    break;
                case 3:
                    System.out.println("\nThank you for using the Grading System!");
                    break;
                default:
                    System.err.println("Invalid choice!");
                    System.out.println();
            }
        } while(option != 3);

	}

}