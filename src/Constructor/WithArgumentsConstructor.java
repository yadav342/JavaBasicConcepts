package Constructor;

public class WithArgumentsConstructor {
        int empId;
        String empName;
        String Company;
        //parameterized constructor with two parameters     // "this" is a keyword in java
        WithArgumentsConstructor(int id, String name){
           empId = id;
           empName = name;
        }

    WithArgumentsConstructor(String company, String name){
        Company = company;
        empName = name;
    }

      void info(){
            System.out.println("Id: "+empId+" Name: "+empName);
       }

         void calling(){
        System.out.println("Id: "+Company+" Name: "+empName);
    }
        public static void main(String args[]){
//            WithArgumentsConstructor obj1 = new WithArgumentsConstructor(10245,"Chaitanya");
//            WithArgumentsConstructor obj2 = new WithArgumentsConstructor(92232,"Negan");
            WithArgumentsConstructor obj3 = new WithArgumentsConstructor("vikram","Sudhakar");
//            obj1.info();
//            obj2.info();

            obj3.calling();

        }
    }

