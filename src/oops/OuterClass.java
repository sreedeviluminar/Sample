package oops;

public class OuterClass {

 class InstanceInner{

        String name ="NANI";

        void dislplay(){

            System.out.println("name = "+name);
        }
    }
    void show(){

        System.out.println("inside show");
    }
    public static void main(String[] args) {

        OuterClass obj = new OuterClass();
        OuterClass.InstanceInner objinner  = obj.new InstanceInner();
        obj.show();
        objinner.dislplay();
    }

}
