import java.util.Scanner;
public class InputfromUser {
        @SuppressWarnings("ConvertToTryWithResources")
        public static void main(String[] args) {

        Scanner sb = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sb.nextLine();

        System.out.print("Enter age: ");
        int age = sb.nextInt();

        sb.nextLine(); // consume leftover newline

        System.out.print("Enter class: ");
        String studentClass = sb.nextLine();

        System.out.println("\n--- Student Details ---");
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
        System.out.println("CLASS: " + studentClass);

        sb.close();
    }

}
        