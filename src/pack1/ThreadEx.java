package pack1;

public class ThreadEx implements Runnable {

    @Override
    public void run() {
        System.out.println("Currently working thread "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {

        ThreadEx obj = new ThreadEx();
        Thread t = new Thread(obj);
        t.start();
    }

}
