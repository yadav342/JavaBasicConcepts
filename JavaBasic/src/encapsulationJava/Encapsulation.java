package encapsulationJava;

public class Encapsulation {

    private String URL;


    //Setter method
    public void setId(String n)
    {
        URL = n;

    }


    // getter method

    public String getId() {
        return URL;
    }


//     //getter method
//    public int getId() {
//        return id;
//    }
//
//
//    public void setName(String n) {
//         name = n;
//    }
//
//    public String getName() {
//        return name;
//    }
}

    class subclass {
        public static void main(String arg[]) {
            Encapsulation obj = new Encapsulation();

              obj.setId("www.google.com");
              String valueofID = obj.getId();

              System.out.println(valueofID);

            //obj.getName();
//            student.setName("vikram");
//
//            student.setId(3);
//            student.setName("subham");
//
//            System.out.println(student.getName());
           // System.out.println( student.getId());
        }

        ;
    }
