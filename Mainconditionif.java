import java.util.Scanner;
public class Mainconditionif {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        int c;

        System.out.print("Enter a: ");
        a = sc.nextInt();

        System.out.print("Enter b: ");
        b = sc.nextInt();

        System.out.print("Enter c: ");
        c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println("A is greater number");}
        
        else if  (b>c && b>a) {
            System.out.println("B is greater number");
        }
        else {
            System.out.println("C is greater number");
        }
        
    }

}