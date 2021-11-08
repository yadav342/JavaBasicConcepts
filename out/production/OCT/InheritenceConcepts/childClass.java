package InheritenceConcepts;

public class childClass {

    private String modelName = "Mustang";

    public static void main(String[] args) {
        childClass myFastCar = new childClass();
        ParentClass p = new ParentClass();
        p.honk();
        System.out.println(p.brand + " " + myFastCar.modelName);
    }
}
