package JavaMethods;

public class D {

    static {
        System.out.println("This is Static");
    }
    public static void main(String args[]) {

        int p;
    //p = A.Sum(2,6);  // return integer

        System.out.println("**********- Sum of two Number-*********");
        //System.out.println(p);

        int k;
        A obj3 = new A();

      // String BnakName= obj3.Bank;

        //String bankname = A.Bank;

      // System.out.println(bankname);

        k = obj3.Mul(4,6);
        System.out.println("**********- Multiplication of two Number-*********");
        System.out.println(k);

        String Name;
        Name = A.Person("Sudhakar");
        System.out.println("**********- String type Method Return Value*********");
        System.out.println(Name);

    }
    }




