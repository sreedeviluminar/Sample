package oops;

interface  Father{
    String  name = "Paul";
    void detailsfather(String job, int age,String bloodgroup);
}
interface Mother{

    String name = "Anitha";
    void detailsmother(String job, int age,String bloodgroup);

}
public class Child implements Father,Mother {

    String name ="Amala Paul";
    char gender = 'f';

    @Override
    public void detailsfather(String job, int age, String bloodgroup) {
        System.out.println("Father's name    : "+Father.name);
        System.out.println("Job            : "+job);
        System.out.println("Age            : "+age);
        System.out.println("Blood Group    : "+bloodgroup );
    }
    @Override
    public void detailsmother(String job, int age, String bloodgroup) {
        System.out.println("Mother's name    : "+Mother.name);
        System.out.println("Job            : "+job);
        System.out.println("Age            : "+age);
        System.out.println("Blood Group    : "+bloodgroup );
    }

}
class Child2 implements Father,Mother{
    String name ="Mohan";
    char gender = 'm';

    @Override
    public void detailsfather(String job, int age, String bloodgroup) {
        System.out.println("Father's name    : "+Father.name);
        System.out.println("Job            : "+job);
        System.out.println("Age            : "+age);
        System.out.println("Blood Group    : "+bloodgroup );
    }
    @Override
    public void detailsmother(String job, int age, String bloodgroup) {
        System.out.println("Mother's name    : "+Mother.name);
        System.out.println("Job            : "+job);
        System.out.println("Age            : "+age);
        System.out.println("Blood Group    : "+bloodgroup );
    }

    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println("Child1 name       : "+obj.name);
        System.out.println("Child1 gender     : "+obj.gender);

        Child2 obj1 = new Child2();
        System.out.println("Child2 name       : "+obj1.name);
        System.out.println("Child2 gender     : "+obj1.gender);

        System.out.println();

        obj.detailsfather("Doctor",40,"B+ve");
        obj.detailsmother("Doctor",37,"A+ve");
    }
}