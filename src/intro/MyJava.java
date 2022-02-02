package intro;

public class MyJava {

    public static void main(String[] args) {
//datatypes

        String name = "Anitha";
        int age = 26;                           //datatype variable_name = value;//-128 to 127
        int salary = 32767;
        int annual_sal = 23456789;
        long phone = 9876543210l;

        float cgpa = 8.3f;
        double cgpa2 = 7.9d;

        char gender ='f';
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" yrs old");
        System.out.println("My monthly salary is "+salary);
        System.out.println("My Annual salary is "+annual_sal);
        System.out.println(phone+" is my phone number");
        System.out.println("My degree cgpa is "+cgpa);
        System.out.println("My pg cgpa is  "+cgpa2);
        System.out.println("My gender  is m/f : "+gender);


        char letter ='\u26ff';
        System.out.println(letter);


    }
}
