package intro;

public class MyArray {



    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        MyArray obj = new MyArray();
        obj.displayyy(a);

    }

    private void displayyy(int[] a) {
        int arraysum = a[0]+a[1]+a[2]+a[3]+a[4];
        System.out.println(arraysum);
    }

}
