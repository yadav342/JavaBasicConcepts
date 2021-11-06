package JavaMethods;

public class C extends A{

    static int Sum( int a, int b){
        System.out.println("This is mthod overriding");
        return 0;
            }

    public static void main(String args[]) {
        C obje = new C();
        obje.Sum(2,6);
    }

}
