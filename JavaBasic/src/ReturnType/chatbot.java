package ReturnType;

    public class chatbot {

        private String firstName;
        private String lastName;

        private int ssn;

        public chatbot(String first, String last, int ssn) {

            this.firstName = first;
            this.lastName = last;
            this.ssn = ssn;
        }

//        public chatbot test1(){
//            chatbot paul = new chatbot("Paul", "Pacheco",  123456);
//            return paul;
//        }





        public static void main(String arg[]){
            chatbot paul = new chatbot("Paul", "Pacheco",  123456);

            chatbot donui = new chatbot("Donui", "Slao", 4985839);

         int SSN = paul.ssn;
         String NAME = paul.firstName;
         String LAST = paul.lastName;

         System.out.println("Properties of paul "+ SSN +","+NAME+","+LAST);
        }
    }


