package intro;


public class StringEx {

    public static void main(String[] args) {
        String s = "hai all welcome to java tutorial";

        String data[] = s.split("l");// "hai" , "all" ,"welcome"............

        for(String d : data){
            System.out.println(d);
        }
    }
}
