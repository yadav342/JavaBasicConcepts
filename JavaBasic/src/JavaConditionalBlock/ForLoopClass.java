package JavaConditionalBlock;
public class ForLoopClass {



    static {

        System.out.println("This is static Block");
    }


    public static int  Sum( int a, int b){     // Sum method   // 1
        int result;
        result = a+b;
        return result;
    }

    public static String Sum(int c,int d, int e){
        //return 0;

        return "Null";
    }

    public static void main(String arg[])  // method   // 2

    {
        System.out.println("*************************");
        int num=10;
        //System.out.println();
        ForLoopClass.Sum(2,6);

        // ---
        for(int i=num; i>=1; i--)     // syntax of for loop
        {
            System.out.println("--> "+i);
        }
        // +++
        for(int i=1; i<=num; i++)     // syntax of for loop
        {
            System.out.println("--> "+i);
        }
        System.out.println("*********************************");
    }


}
