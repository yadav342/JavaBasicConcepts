package JavaVaribales;

public class LocalVariable {
            // instance variable
        public String myVar="instance variable";


       // accessModifire  Method_ReturnType Method_name(){ }


        public int myMethod(){
            // local variable
            String myVar = "Inside Method";
            System.out.println(myVar);

            int sum = 2+3;

            return sum;
        }
        public static void main(String args[]){
            // Creating object
            LocalVariable obj = new LocalVariable();


            LocalVariable obcname = new LocalVariable();




            /* We are calling the method, that changes the
             * value of myVar. We are displaying myVar again after
             * the method call, to demonstrate that the local
             * variable scope is limited to the method itself.
             */
            System.out.println("Calling Method");
            obj.myMethod();
            System.out.println(obj.myVar);
        }
    }
