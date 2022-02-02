package intro;

public class Sample {

    public static void main(String[] args) {

       int a[][] = {{1,2},{2,4}};
       int b[][] = {{1,2},{1,2}};

       int sum[][] = new int[2][2];


       for (int r = 0 ; r<2 ;r++){

           for(int c = 0 ; c < 2 ; c++){

               sum[r][c] = a[r][c] + b[r][c];

               System.out.print(sum[r][c]+" ");
           }
           System.out.println();
       }
    }
}
