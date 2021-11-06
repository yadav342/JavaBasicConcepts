package JavaVaribales;

public class Java_Variable {
    //Staic varibale

     static String myClassVar= "class or static variable";    // Static Variable

      //    Data_Type variable_name = value_of_varibale

       int num = 3;  // non- static variable

        public static void main(String args[]){       // Method


            Java_Variable obj  = new Java_Variable();

            // ---> Instance/object Varibale
           Java_Variable obj2 = new Java_Variable();
           Java_Variable obj3 = new Java_Variable();

            //All three will display "class or static variable"
//            System.out.println(obj.num);   //
//            System.out.println(obj2.num);
//            System.out.println(obj3.num);

            //changing the value of static variable using obj2
            obj2.num = 5;

            //All three will display "Changed Text"
            System.out.println(obj.num);   //
            System.out.println(obj2.num);
            System.out.println(obj3.num);

            System.out.println("Value of staic variable________ "+ myClassVar);

            System.out.println("Value of Non - static varibale "+ obj.num);
        }
    }


