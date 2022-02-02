package intro;

public class Variabless {
    //return type functionname (){}
    //userdefined function
    void add(){
        //local variables a,b,sum
        int a = 20;
        int b = 10;
        int sum = a+b;
        System.out.println("sum =  "+sum);
    }
    public Variabless() {

        String firstname = "Jeeva";
        String lastname = " Paul";
        System.out.println(firstname+lastname);
    }
    public static void main(String[] args) {

    //classname objectname = newkeyword constructor();
        Variabless localvariables = new Variabless();
        localvariables.add();
    }
}
