package oops;

 abstract class  MyInter{

    abstract  void show();
}
public class AnonymousInner {

    public static void main(String[] args) {

     MyInter obj = new MyInter() {
         @Override
         void show() {

         }
     };
     obj.show();
    }

}