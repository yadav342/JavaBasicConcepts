package Constructor;

public class WithoutArgumentsConstructor {

        String name;
        //Constructor
        WithoutArgumentsConstructor(){
            this.name = "BeginnersBook.com";
        }
        public static void main(String[] args) {
            WithoutArgumentsConstructor obj = new WithoutArgumentsConstructor();
            System.out.println(obj.name);
        }
    }

