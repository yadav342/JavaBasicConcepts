package JavaMethods;

public class MethodOverloading {

    public int sum(int a, int b) {
        int result = a+b;
        // method disp
        System.out.println(result);
        return result;
    }
    public int sum(int a, int b, int c) {
        int result1 = a+b+c;
        // method disp
        System.out.println(result1);
        return result1;
    }

    public static void main(String args[]) {
        MethodOverloading obj = new MethodOverloading();
           obj.sum(1,5);

        obj.sum(8, 10,0);

    }
}

