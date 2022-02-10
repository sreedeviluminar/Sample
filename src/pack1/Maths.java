package pack1;

public class Maths {
  synchronized static void table(int num){
       System.out.println("print multiplication table of "+num);

           for (int i = 1; i <= 10; i++) {
               System.out.println(num + "*" + i + "=" + (num * i));
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
}
class Thread1 extends Thread{
    @Override
    public void run() {
       Maths.table(1);
    }
}
class Thread2 extends Thread{

    @Override
    public void run() {
        Maths.table(4);
    }
}
class Thread3 extends Thread{

    @Override
    public void run() {
        Maths.table(6);
    }
}
class  main{
    public static void main(String[] args) {

        Maths obj = new Maths();
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.start();
    }
}
