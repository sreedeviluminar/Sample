package intro;

import java.util.Scanner;

public class JumpStatements {

    void add(int a, int b){

        int sum = a+b;
        System.out.println(sum);

   }
    public static void main(String[] args) {

       JumpStatements obj = new JumpStatements();

        Scanner o = new Scanner(System.in);
        System.out.println("Enter value of a,b");
        int a= o.nextInt();
        int b=o.nextInt();

        obj.add(a,b);

    }
}
