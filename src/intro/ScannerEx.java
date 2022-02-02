package intro;
import java.util.Scanner;

public class ScannerEx {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the details");
        System.out.println("enter your name");
        String name = obj.next();
        System.out.println("enter your age");
        int age = obj.nextInt();
        System.out.println("enter your cgpa");
        float cgpa = obj.nextFloat();
        System.out.println("enter your gender");
        char gender = obj.next().charAt(0);//                male     female

        System.out.println("name = "+name);
        System.out.println("age = "+age);
        System.out.println("cgpa = "+cgpa);
        System.out.println("gender = "+gender);



    }
}
