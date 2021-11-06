package JavaVaribales;

public class Instance_Variable {

        String myInstanceVar="instance variable";

        public static void main(String args[]){
            Instance_Variable obj = new Instance_Variable();
            Instance_Variable obj2 = new Instance_Variable();
            Instance_Variable obj3 = new Instance_Variable();

            System.out.println(obj.myInstanceVar);
            System.out.println(obj2.myInstanceVar);
            System.out.println(obj3.myInstanceVar);


            obj2.myInstanceVar = "Changed Text";


            System.out.println(obj.myInstanceVar);
            System.out.println(obj2.myInstanceVar);
            System.out.println(obj3.myInstanceVar);
        }
    }

