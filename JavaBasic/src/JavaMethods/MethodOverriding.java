package JavaMethods;

public class MethodOverriding {


    int Sum( int a, int b){     // Sum method

        System.out.println("Override Method");
        return 0;
    }

    public static void main(String args[]) {

        MethodOverriding ob = new MethodOverriding();
        ob.Sum(1,5);
    }

    }




