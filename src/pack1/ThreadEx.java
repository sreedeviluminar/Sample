package pack1;

class Mathss{

    void print(int num ) {

        for(int i = 1; i<= 10;i++) {

            System.out.println(num+" * "+i + " = "+(num*i));

            try {

                Thread.sleep(1000);

            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadEx {
    public static void main(String[] args) {

    }

}
