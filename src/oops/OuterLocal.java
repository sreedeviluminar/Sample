package oops;
public class OuterLocal {

    void show(){

        class LocalInner{
            int a = 10;
            int b = 20;
            void sum(){
                System.out.println("sum = "+(a+b));
            }
        }
        LocalInner obj = new LocalInner();
        obj.sum();
        System.out.println("inside show function from outer class");
    }
    public static void main(String[] args) {
        OuterLocal obj = new OuterLocal();
        obj.show();
    }
}
