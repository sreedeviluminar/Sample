package intro;

public class Student {
  //instance variable
    String name;
    int age ;
    long phone;
    //static variable
    static String course ="Android" ;

    public static void main(String[] args) {
      Student st1 = new Student();
      System.out.println("Student 1 name "+(st1.name ="John"));
      System.out.println("Student 1 age "+(st1.age =20));
      System.out.println("Student 1 phone "+(st1.phone =987654321));
      System.out.println("Student 1 course "+course);

      System.out.println("-------------------------------------");

      Student st2 = new Student();
      System.out.println("Student 2 name "+(st2.name ="Shamil"));
      System.out.println("Student 2 age "+(st2.age =21));
      System.out.println("Student 2 phone "+(st2.phone =987000431));
      System.out.println("Student 2 course "+(course="Testing"));

      System.out.println("-------------------------------------");

      Student st3 = new Student();
      System.out.println("Student 3 name "+(st3.name ="Sharwan"));
      System.out.println("Student 3 age "+(st3.age =21));
      System.out.println("Student 3 phone "+(st3.phone =987000999));
      System.out.println("Student 3 course "+course);

      System.out.println(st1.name);
      System.out.println(st2.name);
      System.out.println(st3.name);
      System.out.println(course);




    }

}
